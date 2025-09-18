package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class RB implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SB b;

    public /* synthetic */ RB(SB sb, Bundle bundle, int i) {
        this.a = i;
        this.b = sb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b.getClass();
                break;
            case 1:
                this.b.b.getClass();
                break;
            case 2:
                this.b.b.getClass();
                break;
            case 3:
                this.b.b.getClass();
                break;
            case 4:
                this.b.b.getClass();
                break;
            case 5:
                this.b.b.getClass();
                break;
            case 6:
                this.b.b.getClass();
                break;
            case 7:
                this.b.b.getClass();
                break;
            case 8:
                this.b.b.getClass();
                break;
            default:
                this.b.b.getClass();
                break;
        }
    }

    public /* synthetic */ RB(SB sb, String str, Bundle bundle, int i) {
        this.a = i;
        this.b = sb;
    }

    public RB(SB sb, int i, Bundle bundle) {
        this.a = 1;
        this.b = sb;
    }

    public RB(SB sb, int i, Uri uri, boolean z, Bundle bundle) {
        this.a = 5;
        this.b = sb;
    }

    public RB(SB sb, int i, int i2, Bundle bundle) {
        this.a = 6;
        this.b = sb;
    }

    public RB(SB sb, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.a = 8;
        this.b = sb;
    }
}
