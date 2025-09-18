package p000;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: RB */
/* loaded from: classes.dex */
public final class RunnableC1081RB implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10055a;

    /* renamed from: b */
    public final /* synthetic */ BinderC1144SB f10056b;

    public /* synthetic */ RunnableC1081RB(BinderC1144SB binderC1144SB, Bundle bundle, int i) {
        this.f10055a = i;
        this.f10056b = binderC1144SB;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10055a) {
            case 0:
                this.f10056b.f10609b.getClass();
                break;
            case 1:
                this.f10056b.f10609b.getClass();
                break;
            case 2:
                this.f10056b.f10609b.getClass();
                break;
            case 3:
                this.f10056b.f10609b.getClass();
                break;
            case 4:
                this.f10056b.f10609b.getClass();
                break;
            case 5:
                this.f10056b.f10609b.getClass();
                break;
            case 6:
                this.f10056b.f10609b.getClass();
                break;
            case 7:
                this.f10056b.f10609b.getClass();
                break;
            case 8:
                this.f10056b.f10609b.getClass();
                break;
            default:
                this.f10056b.f10609b.getClass();
                break;
        }
    }

    public /* synthetic */ RunnableC1081RB(BinderC1144SB binderC1144SB, String str, Bundle bundle, int i) {
        this.f10055a = i;
        this.f10056b = binderC1144SB;
    }

    public RunnableC1081RB(BinderC1144SB binderC1144SB, int i, Bundle bundle) {
        this.f10055a = 1;
        this.f10056b = binderC1144SB;
    }

    public RunnableC1081RB(BinderC1144SB binderC1144SB, int i, Uri uri, boolean z, Bundle bundle) {
        this.f10055a = 5;
        this.f10056b = binderC1144SB;
    }

    public RunnableC1081RB(BinderC1144SB binderC1144SB, int i, int i2, Bundle bundle) {
        this.f10055a = 6;
        this.f10056b = binderC1144SB;
    }

    public RunnableC1081RB(BinderC1144SB binderC1144SB, int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        this.f10055a = 8;
        this.f10056b = binderC1144SB;
    }
}
