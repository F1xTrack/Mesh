package com.facebook.react.devsupport;

import com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import p000.C0226Da;
import p000.InterfaceC11562wa0;
import p000.InterfaceC9101dL0;

@InterfaceC9101dL0(name = NativeJSCHeapCaptureSpec.NAME, needsEagerInit = true)
/* loaded from: classes.dex */
public class JSCHeapCapture extends NativeJSCHeapCaptureSpec {
    private InterfaceC11562wa0 mCaptureInProgress;

    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeJSCHeapCaptureSpec
    public synchronized void captureComplete(String str, String str2) {
    }

    public synchronized void captureHeap(String str, InterfaceC11562wa0 interfaceC11562wa0) {
        File file = new File(str + "/capture.json");
        file.delete();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            HeapCapture heapCapture = (HeapCapture) reactApplicationContextIfActiveOrWarn.getJSModule(HeapCapture.class);
            if (heapCapture == null) {
                new C0226Da("Heap capture js module not registered.", 9);
                interfaceC11562wa0.m25652a();
                return;
            }
            heapCapture.captureHeap(file.getPath());
        }
    }
}
