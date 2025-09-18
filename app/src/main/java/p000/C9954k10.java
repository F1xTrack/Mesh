package p000;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: k10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9954k10 implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ int f36220a;

    /* renamed from: b */
    public final /* synthetic */ Object f36221b;

    public /* synthetic */ C9954k10(int i, Object obj) {
        this.f36220a = i;
        this.f36221b = obj;
    }

    /* renamed from: a */
    private final boolean m22132a(Message message) {
        if (message.what != 0) {
            return false;
        }
        C6540oF c6540oF = (C6540oF) this.f36221b;
        AbstractC1374Vq.m8597p(message.obj);
        synchronized (c6540oF.f38903a) {
            throw null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f36220a) {
            case 0:
                int i = message.what;
                C10082l10 c10082l10 = (C10082l10) this.f36221b;
                if (i == 1) {
                    c10082l10.m22333b((C9698i10) message.obj);
                    return true;
                }
                if (i == 2) {
                    c10082l10.f36808d.clear((C9698i10) message.obj);
                }
                return false;
            case 1:
                return m22132a(message);
            case 2:
                int i2 = message.what;
                C9025cn1 c9025cn1 = (C9025cn1) this.f36221b;
                if (i2 == 1) {
                    c9025cn1.m10870b((C8639Zm1) message.obj);
                    return true;
                }
                if (i2 == 2) {
                    c9025cn1.f17752d.clear((C8639Zm1) message.obj);
                }
                return false;
            default:
                int i3 = message.arg1;
                FY1 fy1 = (FY1) this.f36221b;
                synchronized (fy1) {
                    try {
                        C10209m02 c10209m02 = (C10209m02) fy1.f3306e.get(i3);
                        if (c10209m02 == null) {
                            return true;
                        }
                        fy1.f3306e.remove(i3);
                        fy1.m2670c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            c10209m02.m22626b(new C0226Da(14, "Not supported by GmsCore", null));
                            return true;
                        }
                        switch (c10209m02.f37392e) {
                            case 0:
                                if (!data.getBoolean("ack", false)) {
                                    c10209m02.m22626b(new C0226Da(14, "Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    c10209m02.toString();
                                }
                                c10209m02.f37389b.m7184b(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    c10209m02.toString();
                                    String.valueOf(bundle);
                                }
                                c10209m02.f37389b.m7184b(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
        }
    }
}
