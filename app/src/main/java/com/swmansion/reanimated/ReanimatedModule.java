package com.swmansion.reanimated;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.fabric.FabricUIManager;
import com.facebook.react.fabric.interop.UIBlock;
import com.facebook.react.fabric.interop.UIBlockViewResolver;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.worklets.WorkletsModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import p000.C11856yu0;
import p000.H30;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9270ef1;
import p000.MD0;
import p000.RunnableC0004A3;

@InterfaceC9101dL0(name = NativeReanimatedModuleSpec.NAME)
/* loaded from: classes2.dex */
public class ReanimatedModule extends NativeReanimatedModuleSpec implements LifecycleEventListener, InterfaceC9270ef1, UIManagerListener {
    private NodesManager mNodesManager;
    private ArrayList<UIThreadOperation> mOperations;
    private Runnable mUnsubscribe;
    private final WorkletsModule mWorkletsModule;

    public interface UIThreadOperation {
        void execute(NodesManager nodesManager);
    }

    public ReanimatedModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mOperations = new ArrayList<>();
        this.mUnsubscribe = new RunnableC0004A3(7);
        this.mWorkletsModule = (WorkletsModule) reactApplicationContext.getNativeModule(WorkletsModule.class);
    }

    private /* synthetic */ void lambda$initialize$2(UIManager uIManager) {
        ((FabricUIManager) uIManager).removeUIManagerEventListener(this);
    }

    public /* synthetic */ void lambda$initialize$3(UIManagerModule uIManagerModule) {
        uIManagerModule.removeUIManagerListener(this);
    }

    public /* synthetic */ void lambda$initialize$4(ReactApplicationContext reactApplicationContext) {
        reactApplicationContext.removeLifecycleEventListener(this);
    }

    public static /* synthetic */ void lambda$new$1() {
    }

    public /* synthetic */ void lambda$willDispatchViewUpdates$0(ArrayList arrayList, UIBlockViewResolver uIBlockViewResolver) {
        NodesManager nodesManager = getNodesManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((UIThreadOperation) it.next()).execute(nodesManager);
        }
    }

    public /* synthetic */ void lambda$willDispatchViewUpdates$5(ArrayList arrayList, C11856yu0 c11856yu0) {
        NodesManager nodesManager = getNodesManager();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((UIThreadOperation) it.next()).execute(nodesManager);
        }
    }

    @ReactMethod
    public void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uIManager) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uIManager) {
    }

    public NodesManager getNodesManager() {
        if (this.mNodesManager == null) {
            this.mNodesManager = new NodesManager(getReactApplicationContext(), this.mWorkletsModule);
        }
        return this.mNodesManager;
    }

    public WorkletsModule getWorkletsModule() {
        return this.mWorkletsModule;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        UIManagerModule uIManagerModule = (UIManagerModule) reactApplicationContext.getNativeModule(UIManagerModule.class);
        Objects.requireNonNull(uIManagerModule);
        uIManagerModule.addUIManagerListener(this);
        this.mUnsubscribe = Utils.combineRunnables(this.mUnsubscribe, new MD0(this, 14, uIManagerModule));
        reactApplicationContext.addLifecycleEventListener(this);
        this.mUnsubscribe = Utils.combineRunnables(this.mUnsubscribe, new MD0(this, 15, reactApplicationContext));
    }

    @Override // com.swmansion.reanimated.NativeReanimatedModuleSpec
    @ReactMethod(isBlockingSynchronousMethod = true)
    public boolean installTurboModule() {
        JavaScriptContextHolder javaScriptContextHolder = getReactApplicationContext().getJavaScriptContextHolder();
        Objects.requireNonNull(javaScriptContextHolder);
        boolean z = javaScriptContextHolder.get() == 0;
        Utils.isChromeDebugger = z;
        if (z) {
            return false;
        }
        getNodesManager().initWithContext(getReactApplicationContext());
        return true;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.invalidate();
        }
        this.mUnsubscribe.run();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostPause();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        NodesManager nodesManager = this.mNodesManager;
        if (nodesManager != null) {
            nodesManager.onHostResume();
        }
    }

    @ReactMethod
    public void removeListeners(Integer num) {
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uIManager) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        final ArrayList<UIThreadOperation> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        if (!(uIManager instanceof FabricUIManager)) {
            throw new RuntimeException("[Reanimated] Failed to obtain instance of FabricUIManager.");
        }
        ((FabricUIManager) uIManager).addUIBlock(new UIBlock() { // from class: ON0
            @Override // com.facebook.react.fabric.interop.UIBlock
            public final void execute(UIBlockViewResolver uIBlockViewResolver) {
                this.f8403a.lambda$willDispatchViewUpdates$0(arrayList, uIBlockViewResolver);
            }
        });
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uIManager) {
    }

    @Override // p000.InterfaceC9270ef1
    public void willDispatchViewUpdates(UIManagerModule uIManagerModule) {
        if (this.mOperations.isEmpty()) {
            return;
        }
        ArrayList<UIThreadOperation> arrayList = this.mOperations;
        this.mOperations = new ArrayList<>();
        uIManagerModule.addUIBlock(new H30(this, 4, arrayList));
    }
}
