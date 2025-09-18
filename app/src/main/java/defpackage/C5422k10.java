package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* renamed from: k10, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5422k10 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C5422k10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final boolean a(Message message) {
        if (message.what != 0) {
            return false;
        }
        C6230oF c6230oF = (C6230oF) this.b;
        AbstractC1705Vq.p(message.obj);
        synchronized (c6230oF.a) {
            throw null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                C5613l10 c5613l10 = (C5613l10) this.b;
                if (i == 1) {
                    c5613l10.b((C4264i10) message.obj);
                    return true;
                }
                if (i == 2) {
                    c5613l10.d.clear((C4264i10) message.obj);
                }
                return false;
            case 1:
                return a(message);
            case 2:
                int i2 = message.what;
                C2582cn1 c2582cn1 = (C2582cn1) this.b;
                if (i2 == 1) {
                    c2582cn1.b((C2007Zm1) message.obj);
                    return true;
                }
                if (i2 == 2) {
                    c2582cn1.d.clear((C2007Zm1) message.obj);
                }
                return false;
            default:
                int i3 = message.arg1;
                FY1 fy1 = (FY1) this.b;
                synchronized (fy1) {
                    try {
                        C5802m02 c5802m02 = (C5802m02) fy1.e.get(i3);
                        if (c5802m02 == null) {
                            return true;
                        }
                        fy1.e.remove(i3);
                        fy1.c();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            c5802m02.b(new C0254Da(14, "Not supported by GmsCore", null));
                            return true;
                        }
                        switch (c5802m02.e) {
                            case 0:
                                if (!data.getBoolean("ack", false)) {
                                    c5802m02.b(new C0254Da(14, "Invalid response to one way request", null));
                                    return true;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    c5802m02.toString();
                                }
                                c5802m02.b.b(null);
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                if (Log.isLoggable("MessengerIpcClient", 3)) {
                                    c5802m02.toString();
                                    String.valueOf(bundle);
                                }
                                c5802m02.b.b(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
        }
    }
}
