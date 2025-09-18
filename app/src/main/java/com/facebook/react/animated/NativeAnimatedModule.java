package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC0852NX;
import p000.AbstractC7222ym;
import p000.AbstractC9811iu0;
import p000.AbstractChoreographerFrameCallbackC9317f20;
import p000.C0986Pf;
import p000.C8548Xt0;
import p000.C8600Yt0;
import p000.C8652Zt0;
import p000.C8782au0;
import p000.C8910bu0;
import p000.C9043cu0;
import p000.C9171du0;
import p000.C9299eu0;
import p000.C9427fu0;
import p000.C9555gu0;
import p000.C9683hu0;
import p000.InterfaceC6947uP;
import p000.InterfaceC9101dL0;
import p000.MJ0;
import p000.OZ1;
import p000.R02;
import p000.UN1;

@InterfaceC9101dL0(name = NativeAnimatedModuleSpec.NAME)
/* loaded from: classes.dex */
public class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final boolean ANIMATED_MODULE_DEBUG = false;
    private final AbstractChoreographerFrameCallbackC9317f20 mAnimatedFrameCallback;
    private boolean mBatchingControlledByJS;
    private volatile long mCurrentBatchNumber;
    private volatile long mCurrentFrameNumber;
    private boolean mEnqueuedAnimationOnFrame;
    private boolean mInitializedForFabric;
    private boolean mInitializedForNonFabric;
    private final AtomicReference<C1881a> mNodesManager;
    private int mNumFabricAnimations;
    private int mNumNonFabricAnimations;
    private final C9683hu0 mOperations;
    private final C9683hu0 mPreOperations;
    private final MJ0 mReactChoreographer;
    private int mUIManagerType;

    public NativeAnimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new C9683hu0();
        this.mPreOperations = new C9683hu0();
        this.mNodesManager = new AtomicReference<>();
        this.mBatchingControlledByJS = false;
        this.mInitializedForFabric = false;
        this.mInitializedForNonFabric = false;
        this.mEnqueuedAnimationOnFrame = false;
        this.mUIManagerType = 1;
        this.mNumFabricAnimations = 0;
        this.mNumNonFabricAnimations = 0;
        this.mReactChoreographer = MJ0.m5303a();
        this.mAnimatedFrameCallback = new C8910bu0(this, reactApplicationContext);
    }

    private void addOperation(AbstractC9811iu0 abstractC9811iu0) {
        abstractC9811iu0.f34796a = this.mCurrentBatchNumber;
        this.mOperations.f28669a.add(abstractC9811iu0);
    }

    private void addPreOperation(AbstractC9811iu0 abstractC9811iu0) {
        abstractC9811iu0.f34796a = this.mCurrentBatchNumber;
        this.mPreOperations.f28669a.add(abstractC9811iu0);
    }

    private void addUnbatchedOperation(AbstractC9811iu0 abstractC9811iu0) {
        abstractC9811iu0.f34796a = -1L;
        this.mOperations.f28669a.add(abstractC9811iu0);
    }

    private void clearFrameCallback() {
        MJ0 mj0 = this.mReactChoreographer;
        UN1.m7999c(mj0);
        mj0.m5306d(3, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = false;
    }

    public void decrementInFlightAnimationsForViewTag(int i) {
        if (R02.m6874b(i) == 2) {
            this.mNumFabricAnimations--;
        } else {
            this.mNumNonFabricAnimations--;
        }
        int i2 = this.mNumNonFabricAnimations;
        if (i2 == 0 && this.mNumFabricAnimations > 0 && this.mUIManagerType != 2) {
            this.mUIManagerType = 2;
        } else {
            if (this.mNumFabricAnimations != 0 || i2 <= 0 || this.mUIManagerType == 1) {
                return;
            }
            this.mUIManagerType = 1;
        }
    }

    public void enqueueFrameCallback() {
        if (this.mEnqueuedAnimationOnFrame) {
            return;
        }
        MJ0 mj0 = this.mReactChoreographer;
        UN1.m7999c(mj0);
        mj0.m5305c(3, this.mAnimatedFrameCallback);
        this.mEnqueuedAnimationOnFrame = true;
    }

    private void initializeLifecycleEventListenersForViewTag(int i) {
        UIManager uIManagerM6095f;
        int iM6874b = R02.m6874b(i);
        this.mUIManagerType = iM6874b;
        if (iM6874b == 2) {
            this.mNumFabricAnimations++;
        } else {
            this.mNumNonFabricAnimations++;
        }
        C1881a nodesManager = getNodesManager();
        if (nodesManager != null) {
            int i2 = this.mUIManagerType;
            if (i2 != 2 ? !nodesManager.f17887i : !nodesManager.f17886h) {
                UIManager uIManagerM6095f2 = OZ1.m6095f(nodesManager.f17883e, i2, true);
                if (uIManagerM6095f2 != null) {
                    ((InterfaceC6947uP) uIManagerM6095f2.getEventDispatcher()).mo11049j(nodesManager);
                    if (i2 == 2) {
                        nodesManager.f17886h = true;
                    } else {
                        nodesManager.f17887i = true;
                    }
                }
            }
        } else {
            ReactSoftExceptionLogger.logSoftException(NativeAnimatedModuleSpec.NAME, new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if (this.mUIManagerType == 2) {
            if (this.mInitializedForFabric) {
                return;
            }
        } else if (this.mInitializedForNonFabric) {
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext == null || (uIManagerM6095f = OZ1.m6095f(reactApplicationContext, this.mUIManagerType, true)) == null) {
            return;
        }
        uIManagerM6095f.addUIManagerEventListener(this);
        if (this.mUIManagerType == 2) {
            this.mInitializedForFabric = true;
        } else {
            this.mInitializedForNonFabric = true;
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double d, String str, ReadableMap readableMap) {
        int i = (int) d;
        initializeLifecycleEventListenersForViewTag(i);
        addOperation(new C9043cu0(i, str, readableMap));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(String str) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double d, double d2) {
        int i = (int) d2;
        initializeLifecycleEventListenersForViewTag(i);
        addOperation(new C8782au0((int) d, i, 2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double d, double d2) {
        addOperation(new C8782au0((int) d, (int) d2, 0));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double d, ReadableMap readableMap) {
        addOperation(new C9555gu0((int) d, 0, readableMap));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
        if (this.mUIManagerType != 2) {
            return;
        }
        long j = this.mCurrentBatchNumber - 1;
        if (!this.mBatchingControlledByJS) {
            this.mCurrentFrameNumber++;
            if (this.mCurrentFrameNumber - this.mCurrentBatchNumber > 2) {
                this.mCurrentBatchNumber = this.mCurrentFrameNumber;
                j = this.mCurrentBatchNumber;
            }
        }
        this.mPreOperations.m18885a(j, getNodesManager());
        this.mOperations.m18885a(j, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
        this.mCurrentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double d, double d2) {
        int i = (int) d2;
        decrementInFlightAnimationsForViewTag(i);
        addOperation(new C8782au0((int) d, i, 3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double d, double d2) {
        addOperation(new C8782au0((int) d, (int) d2, 1));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double d) {
        addOperation(new C8600Yt0((int) d, 5));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double d) {
        addOperation(new C8600Yt0((int) d, 1));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double d) {
        addOperation(new C8600Yt0((int) d, 0));
    }

    public C1881a getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.mNodesManager.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            AtomicReference<C1881a> atomicReference = this.mNodesManager;
            C1881a c1881a = new C1881a(reactApplicationContextIfActiveOrWarn);
            while (!atomicReference.compareAndSet(null, c1881a) && atomicReference.get() == null) {
            }
        }
        return this.mNodesManager.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double d, Callback callback) {
        addOperation(new C9299eu0((int) d, callback, 0));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
        int size = readableArray.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            int i3 = readableArray.getInt(i);
            if (AbstractC0852NX.f7856a == null) {
                AbstractC0852NX.f7856a = AbstractC7222ym.m26223C(21);
            }
            switch (AbstractC7222ym.m26247x(AbstractC0852NX.f7856a[i3 - 1])) {
                case 0:
                case 1:
                case 5:
                case 6:
                case 9:
                case 10:
                case 14:
                    i += 3;
                    continue;
                case 2:
                case 3:
                case 4:
                case 8:
                case 11:
                case 12:
                case 15:
                case 16:
                case 19:
                case 20:
                    i += 2;
                    continue;
                case 7:
                case 18:
                    break;
                case 13:
                    int i4 = i + 2;
                    i += 3;
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i4));
                    continue;
                case 17:
                    initializeLifecycleEventListenersForViewTag(readableArray.getInt(i2));
                    break;
                default:
                    throw new IllegalArgumentException("Batch animation execution op: fetching viewTag: unknown op code");
            }
            i += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new C9043cu0(this, size, readableArray));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double d, String str, double d2) {
        int i = (int) d;
        decrementInFlightAnimationsForViewTag(i);
        addOperation(new C9171du0(i, str, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double d) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double d) {
        addPreOperation(new C8600Yt0((int) d, 3));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double d, double d2) {
        addOperation(new C8548Xt0(d2, (int) d, 1));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double d, double d2) {
        addOperation(new C8548Xt0(d2, (int) d, 0));
    }

    public void setNodesManager(C1881a c1881a) {
        this.mNodesManager.set(c1881a);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double d, double d2, ReadableMap readableMap, Callback callback) {
        addUnbatchedOperation(new C8652Zt0((int) d, readableMap, callback, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double d) {
        int i = (int) d;
        addOperation(new C9299eu0(i, new C0986Pf(this, i, 13), 1));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.mBatchingControlledByJS = true;
        this.mCurrentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double d) {
        addOperation(new C8600Yt0((int) d, 2));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double d) {
        addOperation(new C8600Yt0((int) d, 4));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double d, ReadableMap readableMap) {
        addOperation(new C9555gu0((int) d, 1, readableMap));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if ((this.mOperations.m18886b() && this.mPreOperations.m18886b()) || this.mUIManagerType == 2) {
            return;
        }
        long j = this.mCurrentBatchNumber;
        this.mCurrentBatchNumber = 1 + j;
        C9427fu0 c9427fu0 = new C9427fu0(this, j, 0);
        C9427fu0 c9427fu02 = new C9427fu0(this, j, 1);
        UIManagerModule uIManagerModule = (UIManagerModule) uIManager;
        uIManagerModule.prependUIBlock(c9427fu0);
        uIManagerModule.addUIBlock(c9427fu02);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
    }
}
