package com.facebook.react.bridge.queue;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.common.futures.SimpleSettableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p000.AbstractC3929dS;
import p000.AbstractC7222ym;
import p000.InterfaceC0965PK;

@InterfaceC0965PK
/* loaded from: classes.dex */
public class MessageQueueThreadImpl implements MessageQueueThread {
    private final String mAssertionErrorMessage;
    private final MessageQueueThreadHandler mHandler;
    private volatile boolean mIsFinished;
    private final Looper mLooper;
    private final String mName;
    private MessageQueueThreadPerfStats mPerfStats;

    /* renamed from: com.facebook.react.bridge.queue.MessageQueueThreadImpl$5 */
    public static /* synthetic */ class C19145 {

        /* renamed from: $SwitchMap$com$facebook$react$bridge$queue$MessageQueueThreadSpec$ThreadType */
        static final /* synthetic */ int[] f17890x16463f8b;

        static {
            int[] iArr = new int[MessageQueueThreadSpec.ThreadType.values().length];
            f17890x16463f8b = iArr;
            try {
                iArr[MessageQueueThreadSpec.ThreadType.MAIN_UI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17890x16463f8b[MessageQueueThreadSpec.ThreadType.NEW_BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        this(str, looper, queueThreadExceptionHandler, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void assignToPerfStats(MessageQueueThreadPerfStats messageQueueThreadPerfStats, long j, long j2) {
        messageQueueThreadPerfStats.wallTime = j;
        messageQueueThreadPerfStats.cpuTime = j2;
    }

    public static MessageQueueThreadImpl create(MessageQueueThreadSpec messageQueueThreadSpec, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        int i = C19145.f17890x16463f8b[messageQueueThreadSpec.getThreadType().ordinal()];
        if (i == 1) {
            return createForMainThread(messageQueueThreadSpec.getName(), queueThreadExceptionHandler);
        }
        if (i == 2) {
            return startNewBackgroundThread(messageQueueThreadSpec.getName(), messageQueueThreadSpec.getStackSize(), queueThreadExceptionHandler);
        }
        throw new RuntimeException("Unknown thread type: " + messageQueueThreadSpec.getThreadType());
    }

    private static MessageQueueThreadImpl createForMainThread(String str, QueueThreadExceptionHandler queueThreadExceptionHandler) throws SecurityException, IllegalArgumentException {
        MessageQueueThreadImpl messageQueueThreadImpl = new MessageQueueThreadImpl(str, Looper.getMainLooper(), queueThreadExceptionHandler);
        if (UiThreadUtil.isOnUiThread()) {
            Process.setThreadPriority(-4);
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.3
                @Override // java.lang.Runnable
                public void run() throws SecurityException, IllegalArgumentException {
                    Process.setThreadPriority(-4);
                }
            });
        }
        return messageQueueThreadImpl;
    }

    private static MessageQueueThreadImpl startNewBackgroundThread(String str, long j, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        new Thread(null, new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.4
            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(-4);
                Looper.prepare();
                MessageQueueThreadPerfStats messageQueueThreadPerfStats = new MessageQueueThreadPerfStats();
                MessageQueueThreadImpl.assignToPerfStats(messageQueueThreadPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
                SimpleSettableFuture simpleSettableFuture2 = simpleSettableFuture;
                Pair pair = new Pair(Looper.myLooper(), messageQueueThreadPerfStats);
                CountDownLatch countDownLatch = simpleSettableFuture2.f17895a;
                if (countDownLatch.getCount() == 0) {
                    throw new RuntimeException("Result has already been set!");
                }
                simpleSettableFuture2.f17896b = pair;
                countDownLatch.countDown();
                Looper.loop();
            }
        }, AbstractC7222ym.m26245v("mqt_", str), j).start();
        try {
            Pair pair = (Pair) simpleSettableFuture.get();
            return new MessageQueueThreadImpl(str, (Looper) pair.first, queueThreadExceptionHandler, (MessageQueueThreadPerfStats) pair.second);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC0965PK
    public void assertIsOnThread() {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC0965PK
    public <T> Future<T> callOnQueue(final Callable<T> callable) {
        final SimpleSettableFuture simpleSettableFuture = new SimpleSettableFuture();
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.1
            @Override // java.lang.Runnable
            public void run() throws Exception {
                try {
                    SimpleSettableFuture simpleSettableFuture2 = simpleSettableFuture;
                    Object objCall = callable.call();
                    CountDownLatch countDownLatch = simpleSettableFuture2.f17895a;
                    if (countDownLatch.getCount() == 0) {
                        throw new RuntimeException("Result has already been set!");
                    }
                    simpleSettableFuture2.f17896b = objCall;
                    countDownLatch.countDown();
                } catch (Exception e) {
                    SimpleSettableFuture simpleSettableFuture3 = simpleSettableFuture;
                    if (simpleSettableFuture3.f17895a.getCount() == 0) {
                        throw new RuntimeException("Result has already been set!");
                    }
                    simpleSettableFuture3.f17897c = e;
                    simpleSettableFuture3.f17895a.countDown();
                }
            }
        });
        return simpleSettableFuture;
    }

    public Looper getLooper() {
        return this.mLooper;
    }

    public String getName() {
        return this.mName;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC0965PK
    public MessageQueueThreadPerfStats getPerfStats() {
        return this.mPerfStats;
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC0965PK
    public boolean isIdle() {
        return this.mLooper.getQueue().isIdle();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC0965PK
    public boolean isOnThread() {
        return this.mLooper.getThread() == Thread.currentThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC0965PK
    public void quitSynchronous() throws InterruptedException {
        this.mIsFinished = true;
        this.mLooper.quit();
        if (this.mLooper.getThread() != Thread.currentThread()) {
            try {
                this.mLooper.getThread().join();
            } catch (InterruptedException unused) {
                throw new RuntimeException("Got interrupted waiting to join thread " + this.mName);
            }
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC0965PK
    public void resetPerfStats() {
        assignToPerfStats(this.mPerfStats, -1L, -1L);
        runOnQueue(new Runnable() { // from class: com.facebook.react.bridge.queue.MessageQueueThreadImpl.2
            @Override // java.lang.Runnable
            public void run() {
                MessageQueueThreadImpl.assignToPerfStats(MessageQueueThreadImpl.this.mPerfStats, SystemClock.uptimeMillis(), SystemClock.currentThreadTimeMillis());
            }
        });
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC0965PK
    public boolean runOnQueue(Runnable runnable) {
        if (!this.mIsFinished) {
            this.mHandler.post(runnable);
            return true;
        }
        getName();
        AbstractC3929dS.m17683p("ReactNative");
        return false;
    }

    private MessageQueueThreadImpl(String str, Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler, MessageQueueThreadPerfStats messageQueueThreadPerfStats) {
        this.mIsFinished = false;
        this.mName = str;
        this.mLooper = looper;
        this.mHandler = new MessageQueueThreadHandler(looper, queueThreadExceptionHandler);
        this.mPerfStats = messageQueueThreadPerfStats;
        this.mAssertionErrorMessage = "Expected to be called from the '" + getName() + "' thread!";
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    @InterfaceC0965PK
    public void assertIsOnThread(String str) {
        SoftAssertions.assertCondition(isOnThread(), this.mAssertionErrorMessage + " " + str);
    }
}
