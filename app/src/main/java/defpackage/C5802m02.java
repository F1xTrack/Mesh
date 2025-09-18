package defpackage;

import android.os.Bundle;
import android.util.Log;

/* renamed from: m02, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5802m02 {
    public final int a;
    public final S81 b = new S81();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public C5802m02(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(C0254Da c0254Da) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            c0254Da.toString();
        }
        this.b.a(c0254Da);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + a() + "}";
    }
}
