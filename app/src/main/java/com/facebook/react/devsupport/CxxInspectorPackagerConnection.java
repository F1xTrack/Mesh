package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import p000.AbstractC3982eJ;
import p000.C10457nx0;
import p000.C10585ox0;
import p000.C6937uF;
import p000.InterfaceC0965PK;
import p000.InterfaceC4101gC;
import p000.X40;

/* loaded from: classes.dex */
class CxxInspectorPackagerConnection implements X40 {

    @InterfaceC0965PK
    private final HybridData mHybridData;

    public static class DelegateImpl {

        /* renamed from: a */
        public final C10585ox0 f17905a;

        /* renamed from: b */
        public final Handler f17906b;

        public DelegateImpl() {
            C10457nx0 c10457nx0 = new C10457nx0();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c10457nx0.m23286a(10L, timeUnit);
            c10457nx0.m23289d(10L, timeUnit);
            c10457nx0.m23287b(0L, TimeUnit.MINUTES);
            this.f17905a = new C10585ox0(c10457nx0);
            this.f17906b = new Handler(Looper.getMainLooper());
        }

        @InterfaceC0965PK
        public InterfaceC4101gC connectWebSocket(String str, WebSocketDelegate webSocketDelegate) {
            C6937uF c6937uF = new C6937uF(9, false);
            c6937uF.m25136G(str);
            return new C1916b(this.f17905a.m23581c(c6937uF.m25141o(), new C1915a(webSocketDelegate)));
        }

        @InterfaceC0965PK
        public void scheduleCallback(Runnable runnable, long j) {
            this.f17906b.postDelayed(runnable, j);
        }
    }

    @InterfaceC0965PK
    public static class WebSocketDelegate implements Closeable {

        /* renamed from: a */
        public final HybridData f17907a;

        @InterfaceC0965PK
        private WebSocketDelegate(HybridData hybridData) {
            this.f17907a = hybridData;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f17907a.resetNative();
        }

        public native void didClose();

        public native void didFailWithError(Integer num, String str);

        public native void didReceiveMessage(String str);
    }

    static {
        AbstractC3982eJ.m17905g();
    }

    public CxxInspectorPackagerConnection(String str, String str2) {
        this.mHybridData = initHybrid(str, str2, new DelegateImpl());
    }

    private static native HybridData initHybrid(String str, String str2, DelegateImpl delegateImpl);

    public native void closeQuietly();

    @Override // p000.X40
    public native void connect();

    public native void sendEventToAllConnections(String str);
}
