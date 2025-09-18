package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.yandex.varioqub.config.model.ConfigValue;
import kotlin.Metadata;
import p000.AbstractC0504I;
import p000.AbstractC10154lZ1;
import p000.C10737q70;
import p000.C10865r70;
import p000.C11121t70;
import p000.C1685am;
import p000.C8940c70;
import p000.InterfaceC1523YC;
import p000.InterfaceC9101dL0;
import p000.LJ0;
import p000.ML1;
import p000.O90;
import p000.Q60;
import p000.R60;
import p000.S60;
import p000.T60;
import p000.WL0;
import p000.Z60;

@InterfaceC9101dL0(name = "ImageLoader")
@Metadata(m22266d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u0002:\u0001AB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001d\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b!\u0010\"J)\u0010%\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00142\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0014H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0014H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0014H\u0016¢\u0006\u0004\b0\u0010.R\u0018\u00101\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\"\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u00108R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b9\u0010:R$\u0010\u000b\u001a\u00020\n2\u0006\u0010;\u001a\u00020\n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?¨\u0006B"}, m22267d2 = {"Lcom/facebook/react/modules/image/ImageLoaderModule;", "Lcom/facebook/fbreact/specs/NativeImageLoaderAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "callerContext", "(Lcom/facebook/react/bridge/ReactApplicationContext;Ljava/lang/Object;)V", "LZ60;", "imagePipeline", "LLJ0;", "callerContextFactory", "(Lcom/facebook/react/bridge/ReactApplicationContext;LZ60;LLJ0;)V", "", "requestId", "LYC;", "Ljava/lang/Void;", "request", "LTf1;", "registerRequest", "(ILYC;)V", "removeRequest", "(I)LYC;", "", "uriString", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getSize", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "Lcom/facebook/react/bridge/ReadableMap;", "headers", "getSizeWithHeaders", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "requestIdAsDouble", "prefetchImage", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "abortRequest", "(D)V", "Lcom/facebook/react/bridge/ReadableArray;", "uris", "queryCache", "(Lcom/facebook/react/bridge/ReadableArray;Lcom/facebook/react/bridge/Promise;)V", "onHostResume", "()V", "onHostPause", "onHostDestroy", "_imagePipeline", "LZ60;", "enqueuedRequestMonitor", "Ljava/lang/Object;", "Landroid/util/SparseArray;", "enqueuedRequests", "Landroid/util/SparseArray;", "LLJ0;", "getCallerContext", "()Ljava/lang/Object;", "value", "getImagePipeline", "()LZ60;", "setImagePipeline", "(LZ60;)V", "Companion", "Q60", "ReactAndroid_release"}, m22268k = 1, m22269mv = {1, 9, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    public static final Q60 Companion = new Q60();
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private Z60 _imagePipeline;
    private final Object callerContext;
    private LJ0 callerContextFactory;
    private final Object enqueuedRequestMonitor;
    private final SparseArray<InterfaceC1523YC> enqueuedRequests;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = this;
    }

    private final Object getCallerContext() {
        return this.callerContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Z60 getImagePipeline() {
        Z60 z60 = this._imagePipeline;
        if (z60 != null) {
            return z60;
        }
        C8940c70 c8940c70 = C8940c70.f17308t;
        ML1.m5337d(c8940c70, "ImagePipelineFactory was not initialized!");
        Z60 z60M10592e = c8940c70.m10592e();
        O90.m5967e(z60M10592e, "getImagePipeline(...)");
        return z60M10592e;
    }

    private final void registerRequest(int requestId, InterfaceC1523YC request) {
        synchronized (this.enqueuedRequestMonitor) {
            this.enqueuedRequests.put(requestId, request);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC1523YC removeRequest(int requestId) {
        InterfaceC1523YC interfaceC1523YC;
        synchronized (this.enqueuedRequestMonitor) {
            interfaceC1523YC = this.enqueuedRequests.get(requestId);
            this.enqueuedRequests.remove(requestId);
        }
        return interfaceC1523YC;
    }

    private final void setImagePipeline(Z60 z60) {
        this._imagePipeline = z60;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double requestId) {
        InterfaceC1523YC interfaceC1523YCRemoveRequest = removeRequest((int) requestId);
        if (interfaceC1523YCRemoveRequest != null) {
            interfaceC1523YCRemoveRequest.close();
        }
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String uriString, Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        getImagePipeline().m9486a(C10865r70.m24160c(new C11121t70(reactApplicationContext, uriString, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE).f42840b).m24161a(), getCallerContext(), null, null, null).m3673l(new R60(0, promise), C1685am.f15687a);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String uriString, ReadableMap headers, Promise promise) {
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        O90.m5967e(reactApplicationContext, "getReactApplicationContext(...)");
        getImagePipeline().m9486a(new WL0(C10865r70.m24160c(new C11121t70(reactApplicationContext, uriString, ConfigValue.DOUBLE_DEFAULT_VALUE, ConfigValue.DOUBLE_DEFAULT_VALUE).f42840b), headers), getCallerContext(), null, null, null).m3673l(new R60(1, promise), C1685am.f15687a);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.enqueuedRequestMonitor) {
            try {
                int size = this.enqueuedRequests.size();
                for (int i = 0; i < size; i++) {
                    InterfaceC1523YC interfaceC1523YCValueAt = this.enqueuedRequests.valueAt(i);
                    O90.m5967e(interfaceC1523YCValueAt, "valueAt(...)");
                    interfaceC1523YCValueAt.close();
                }
                this.enqueuedRequests.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String uriString, double requestIdAsDouble, Promise promise) {
        AbstractC0504I abstractC0504IM22505a;
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        int i = (int) requestIdAsDouble;
        if (uriString == null || uriString.length() == 0) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        C10737q70 c10737q70M24161a = C10865r70.m24160c(Uri.parse(uriString)).m24161a();
        Z60 imagePipeline = getImagePipeline();
        Object callerContext = getCallerContext();
        imagePipeline.f14726b.getClass();
        if (Boolean.TRUE.booleanValue()) {
            try {
                abstractC0504IM22505a = imagePipeline.m9489d(imagePipeline.f14725a.m8330b(c10737q70M24161a), c10737q70M24161a, callerContext);
            } catch (Exception e) {
                abstractC0504IM22505a = AbstractC10154lZ1.m22505a(e);
            }
        } else {
            abstractC0504IM22505a = AbstractC10154lZ1.m22505a(Z60.f14724l);
        }
        S60 s60 = new S60(this, i, promise);
        registerRequest(i, abstractC0504IM22505a);
        abstractC0504IM22505a.m3673l(s60, C1685am.f15687a);
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray uris, Promise promise) {
        O90.m5968f(uris, "uris");
        O90.m5968f(promise, BaseJavaModule.METHOD_TYPE_PROMISE);
        new T60(this, uris, promise, getReactApplicationContext()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        this.callerContext = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Z60 z60, LJ0 lj0) {
        super(reactApplicationContext);
        O90.m5968f(reactApplicationContext, "reactContext");
        O90.m5968f(z60, "imagePipeline");
        O90.m5968f(lj0, "callerContextFactory");
        this.enqueuedRequestMonitor = new Object();
        this.enqueuedRequests = new SparseArray<>();
        setImagePipeline(z60);
        this.callerContext = null;
    }
}
