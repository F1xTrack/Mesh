package p000;

import android.app.Service;
import android.content.Intent;
import java.io.IOException;

/* renamed from: nU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC10400nU1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f38346a;

    /* renamed from: b */
    public /* synthetic */ int f38347b;

    /* renamed from: c */
    public /* synthetic */ Object f38348c;

    /* renamed from: d */
    public /* synthetic */ Object f38349d;

    /* renamed from: e */
    public /* synthetic */ Cloneable f38350e;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38346a) {
            case 0:
                ((InterfaceC9504gU1) ((RunnableC11662xM1) this.f38348c).f45562e).mo885b(this.f38347b, (IOException) this.f38349d, (byte[]) this.f38350e);
                break;
            default:
                C10525oT0 c10525oT0 = (C10525oT0) this.f38348c;
                OW1 ow1 = (OW1) ((Service) c10525oT0.f39025a);
                int i = this.f38347b;
                if (ow1.mo6079a(i)) {
                    ((OL1) this.f38349d).f8386o.m24554c(Integer.valueOf(i), "Local AppMeasurementService processed last upload request. StartId");
                    c10525oT0.m23435x().f8386o.m24555d("Completed wakeful intent.");
                    ((OW1) ((Service) c10525oT0.f39025a)).mo6080b((Intent) this.f38350e);
                    break;
                }
                break;
        }
    }
}
