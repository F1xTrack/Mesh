package com.facebook.react.fabric.mounting;

import android.os.SystemClock;
import android.os.Trace;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.RetryableMountingLayerException;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.mounting.mountitems.DispatchCommandMountItem;
import com.facebook.react.fabric.mounting.mountitems.MountItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import p000.AbstractC10874rB1;
import p000.AbstractC1374Vq;
import p000.AbstractC3929dS;
import p000.C9773ib0;
import p000.MT1;

/* loaded from: classes.dex */
public class MountItemDispatcher {
    private static final int FRAME_TIME_MS = 16;
    private static final int MAX_TIME_IN_FRAME_FOR_NON_BATCHED_OPERATIONS_MS = 8;
    private static final String TAG = "MountItemDispatcher";
    private final ItemDispatchListener mItemDispatchListener;
    private final MountingManager mMountingManager;
    private final ConcurrentLinkedQueue<DispatchCommandMountItem> mViewCommandMountItems = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<MountItem> mMountItems = new ConcurrentLinkedQueue<>();
    private final ConcurrentLinkedQueue<MountItem> mPreMountItems = new ConcurrentLinkedQueue<>();
    private boolean mInDispatch = false;
    private int mReDispatchCounter = 0;
    private long mBatchedExecutionTime = 0;
    private long mRunStartTime = 0;

    public interface ItemDispatchListener {
        void didDispatchMountItems();

        void didMountItems(List<MountItem> list);

        void willMountItems(List<MountItem> list);
    }

    public MountItemDispatcher(MountingManager mountingManager, ItemDispatchListener itemDispatchListener) {
        this.mMountingManager = mountingManager;
        this.mItemDispatchListener = itemDispatchListener;
    }

    private static <E extends MountItem> List<E> drainConcurrentItemQueue(ConcurrentLinkedQueue<E> concurrentLinkedQueue) {
        if (concurrentLinkedQueue.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        do {
            E ePoll = concurrentLinkedQueue.poll();
            if (ePoll != null) {
                arrayList.add(ePoll);
            }
        } while (!concurrentLinkedQueue.isEmpty());
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    private void executeOrEnqueue(MountItem mountItem) {
        if (!this.mMountingManager.isWaitingForViewAttach(mountItem.getSurfaceId())) {
            mountItem.execute(this.mMountingManager);
            return;
        }
        if (FabricUIManager.ENABLE_FABRIC_LOGS) {
            AbstractC3929dS.m17673f(TAG, "executeOrEnqueue: Item execution delayed, surface %s is not ready yet", Integer.valueOf(mountItem.getSurfaceId()));
        }
        this.mMountingManager.getSurfaceManager(mountItem.getSurfaceId()).scheduleMountItemOnViewAttach(mountItem);
    }

    private List<MountItem> getAndResetMountItems() {
        return drainConcurrentItemQueue(this.mMountItems);
    }

    private Collection<MountItem> getAndResetPreMountItems() {
        return drainConcurrentItemQueue(this.mPreMountItems);
    }

    private List<DispatchCommandMountItem> getAndResetViewCommandMountItems() {
        return drainConcurrentItemQueue(this.mViewCommandMountItems);
    }

    private static boolean haveExceededNonBatchedFrameTime(long j) {
        return 16 - ((System.nanoTime() - j) / 1000000) < 8;
    }

    private static void printMountItem(MountItem mountItem, String str) {
        for (String str2 : mountItem.toString().split("\n")) {
            AbstractC3929dS.m17672e(TAG);
        }
    }

    public void addMountItem(MountItem mountItem) {
        this.mMountItems.add(mountItem);
    }

    public void addPreAllocateMountItem(MountItem mountItem) {
        if (this.mMountingManager.surfaceIsStopped(mountItem.getSurfaceId())) {
            return;
        }
        this.mPreMountItems.add(mountItem);
    }

    public void addViewCommandMountItem(DispatchCommandMountItem dispatchCommandMountItem) {
        this.mViewCommandMountItems.add(dispatchCommandMountItem);
    }

    public void dispatchMountItems(Queue<MountItem> queue) {
        while (!queue.isEmpty()) {
            MountItem mountItemPoll = queue.poll();
            try {
                mountItemPoll.execute(this.mMountingManager);
            } catch (RetryableMountingLayerException e) {
                if (mountItemPoll instanceof DispatchCommandMountItem) {
                    DispatchCommandMountItem dispatchCommandMountItem = (DispatchCommandMountItem) mountItemPoll;
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    }
                } else {
                    printMountItem(mountItemPoll, "dispatchExternalMountItems: mounting failed with " + e.getMessage());
                }
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public void dispatchPreMountItems(long j) {
        MountItem mountItemPoll;
        if (this.mPreMountItems.isEmpty()) {
            return;
        }
        MT1.m5371b("MountItemDispatcher::premountViews");
        this.mInDispatch = true;
        while (!haveExceededNonBatchedFrameTime(j) && (mountItemPoll = this.mPreMountItems.poll()) != null) {
            try {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    printMountItem(mountItemPoll, "dispatchPreMountItems");
                }
                executeOrEnqueue(mountItemPoll);
            } catch (Throwable th) {
                this.mInDispatch = false;
                throw th;
            }
        }
        this.mInDispatch = false;
        Trace.endSection();
    }

    public long getBatchedExecutionTime() {
        return this.mBatchedExecutionTime;
    }

    public long getRunStartTime() {
        return this.mRunStartTime;
    }

    public void tryDispatchMountItems() {
        if (this.mInDispatch) {
            return;
        }
        boolean zDispatchMountItems = true;
        if (((C9773ib0) AbstractC10874rB1.f41370a).forceBatchingMountItemsOnAndroid()) {
            this.mInDispatch = true;
            while (zDispatchMountItems) {
                try {
                    zDispatchMountItems = dispatchMountItems();
                } finally {
                }
            }
            return;
        }
        try {
            boolean zDispatchMountItems2 = dispatchMountItems();
            this.mInDispatch = false;
            this.mItemDispatchListener.didDispatchMountItems();
            int i = this.mReDispatchCounter;
            if (i < 10 && zDispatchMountItems2) {
                if (i > 2) {
                    ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException(AbstractC1374Vq.m8591j(new StringBuilder("Re-dispatched "), this.mReDispatchCounter, " times. This indicates setState (?) is likely being called too many times during mounting.")));
                }
                this.mReDispatchCounter++;
                tryDispatchMountItems();
            }
            this.mReDispatchCounter = 0;
        } catch (Throwable th) {
            try {
                this.mReDispatchCounter = 0;
                throw th;
            } finally {
            }
        }
    }

    private boolean dispatchMountItems() {
        boolean zIsIgnorable;
        if (this.mReDispatchCounter == 0) {
            this.mBatchedExecutionTime = 0L;
        }
        this.mRunStartTime = SystemClock.uptimeMillis();
        List<DispatchCommandMountItem> andResetViewCommandMountItems = getAndResetViewCommandMountItems();
        List<MountItem> andResetMountItems = getAndResetMountItems();
        if (andResetMountItems == null && andResetViewCommandMountItems == null) {
            return false;
        }
        this.mItemDispatchListener.willMountItems(andResetMountItems);
        if (andResetViewCommandMountItems != null) {
            MT1.m5371b("MountItemDispatcher::mountViews viewCommandMountItems");
            for (DispatchCommandMountItem dispatchCommandMountItem : andResetViewCommandMountItems) {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    printMountItem(dispatchCommandMountItem, "dispatchMountItems: Executing viewCommandMountItem");
                }
                try {
                    executeOrEnqueue(dispatchCommandMountItem);
                } catch (RetryableMountingLayerException e) {
                    if (dispatchCommandMountItem.getNumRetries() == 0) {
                        dispatchCommandMountItem.incrementRetries();
                        addViewCommandMountItem(dispatchCommandMountItem);
                    } else {
                        ReactSoftExceptionLogger.logSoftException(TAG, new ReactNoCrashSoftException("Caught exception executing ViewCommand: " + dispatchCommandMountItem.toString(), e));
                    }
                } catch (Throwable th) {
                    ReactSoftExceptionLogger.logSoftException(TAG, new RuntimeException("Caught exception executing ViewCommand: " + dispatchCommandMountItem.toString(), th));
                }
            }
            Trace.endSection();
        }
        Collection<MountItem> andResetPreMountItems = getAndResetPreMountItems();
        if (andResetPreMountItems != null) {
            MT1.m5371b("MountItemDispatcher::mountViews preMountItems");
            for (MountItem mountItem : andResetPreMountItems) {
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    printMountItem(mountItem, "dispatchMountItems: Executing preMountItem");
                }
                executeOrEnqueue(mountItem);
            }
            Trace.endSection();
        }
        if (andResetMountItems != null) {
            MT1.m5371b("MountItemDispatcher::mountViews mountItems to execute");
            long jUptimeMillis = SystemClock.uptimeMillis();
            Iterator<MountItem> it = andResetMountItems.iterator();
            while (it.hasNext()) {
                MountItem next = it.next();
                if (FabricUIManager.ENABLE_FABRIC_LOGS) {
                    printMountItem(next, "dispatchMountItems: Executing mountItem");
                }
                try {
                    executeOrEnqueue(next);
                } finally {
                    if (zIsIgnorable) {
                    }
                }
            }
            this.mBatchedExecutionTime = (SystemClock.uptimeMillis() - jUptimeMillis) + this.mBatchedExecutionTime;
            Trace.endSection();
        }
        this.mItemDispatchListener.didMountItems(andResetMountItems);
        return true;
    }
}
