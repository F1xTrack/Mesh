package defpackage;

import android.app.Service;
import android.content.Intent;
import java.io.IOException;

/* renamed from: nU1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6086nU1 implements Runnable {
    public final /* synthetic */ int a;
    public /* synthetic */ int b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Cloneable e;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((InterfaceC3973gU1) ((RunnableC7969xM1) this.c).e).b(this.b, (IOException) this.d, (byte[]) this.e);
                break;
            default:
                C6273oT0 c6273oT0 = (C6273oT0) this.c;
                OW1 ow1 = (OW1) ((Service) c6273oT0.a);
                int i = this.b;
                if (ow1.a(i)) {
                    ((OL1) this.d).o.c(Integer.valueOf(i), "Local AppMeasurementService processed last upload request. StartId");
                    c6273oT0.x().o.d("Completed wakeful intent.");
                    ((OW1) ((Service) c6273oT0.a)).b((Intent) this.e);
                    break;
                }
                break;
        }
    }
}
