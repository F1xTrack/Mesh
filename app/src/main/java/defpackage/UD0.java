package defpackage;

import android.content.ContentResolver;
import android.os.Build;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class UD0 extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int e;
    public final /* synthetic */ VD0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UD0(VD0 vd0, int i) {
        super(0);
        this.e = i;
        this.f = vd0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() throws Throwable {
        C2328bS0 c2328bS0A;
        boolean z = false;
        z = false;
        int i = 1;
        switch (this.e) {
            case 0:
                AbstractC4368iZ.b();
                VD0 vd0 = this.f;
                SD0 sd0 = vd0.b;
                C4394ii c4394iiG = vd0.g(new C8040xk0((ExecutorService) sd0.i.a, sd0.j, sd0.a, 0));
                vd0.b.getClass();
                return new W91(c4394iiG, vd0.e);
            case 1:
                AbstractC4368iZ.b();
                VD0 vd02 = this.f;
                SD0 sd02 = vd02.b;
                ExecutorService executorService = (ExecutorService) sd02.i.a;
                O90.f(executorService, "executor");
                VH vh = sd02.j;
                O90.f(vh, "pooledByteBufferFactory");
                C4394ii c4394iiG2 = vd02.g(new IC(executorService, vh, 1));
                vd02.b.getClass();
                return new W91(c4394iiG2, vd02.e);
            case 2:
                AbstractC4368iZ.b();
                VD0 vd03 = this.f;
                SD0 sd03 = vd03.b;
                QD0 qd0 = (QD0) vd03.l.getValue();
                sd03.getClass();
                return new W91(qd0, vd03.e);
            case 3:
                AbstractC4368iZ.b();
                VD0 vd04 = this.f;
                AbstractC8355zO1 abstractC8355zO1 = vd04.c;
                synchronized (vd04) {
                    try {
                        O90.f(abstractC8355zO1, "networkFetcher");
                        AbstractC4368iZ.b();
                        SD0 sd04 = vd04.b;
                        C5811m3 c5811m3 = new C5811m3(vd04.g(new C1484Su0(sd04.j, sd04.d, abstractC8355zO1, z ? 1 : 0)), 0);
                        SD0 sd05 = vd04.b;
                        if (vd04.d && vd04.x != 3) {
                            z = true;
                        }
                        c2328bS0A = sd05.a(c5811m3, z, vd04.g);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c2328bS0A;
            case 4:
                VD0 vd05 = this.f;
                SD0 sd06 = vd05.b;
                sd06.getClass();
                return vd05.e(vd05.b.a(new C5811m3(new IC(C2196am.a, sd06.j, 0), 0), true, vd05.g));
            case 5:
                VD0 vd06 = this.f;
                SD0 sd07 = vd06.b;
                C7850wk0 c7850wk0 = new C7850wk0((ExecutorService) sd07.i.a, sd07.j, sd07.c);
                SD0 sd08 = vd06.b;
                return vd06.f(c7850wk0, new InterfaceC3991ga1[]{new C0051Ak0((ExecutorService) sd08.i.a, sd08.j, sd08.a)});
            case 6:
                AbstractC4368iZ.b();
                Object value = this.f.o.getValue();
                O90.e(value, "<get-backgroundLocalCont…ncodeMemorySequence>(...)");
                return new C5811m3((QD0) value, 1);
            case 7:
                VD0 vd07 = this.f;
                SD0 sd09 = vd07.b;
                C8040xk0 c8040xk0 = new C8040xk0((ExecutorService) sd09.i.a, sd09.j, sd09.a, 0);
                SD0 sd010 = vd07.b;
                sd010.getClass();
                ExecutorService executorService2 = (ExecutorService) sd010.i.a;
                ContentResolver contentResolver = sd010.a;
                VH vh2 = sd010.j;
                return vd07.f(c8040xk0, new InterfaceC3991ga1[]{new C8230yk0(executorService2, vh2, contentResolver), new C0051Ak0(executorService2, vh2, contentResolver)});
            case 8:
                AbstractC4368iZ.b();
                Object value2 = this.f.n.getValue();
                O90.e(value2, "<get-backgroundLocalFile…ncodeMemorySequence>(...)");
                return new C5811m3((QD0) value2, 1);
            case 9:
                AbstractC4368iZ.b();
                VD0 vd08 = this.f;
                SD0 sd011 = vd08.b;
                Object value3 = vd08.n.getValue();
                O90.e(value3, "<get-backgroundLocalFile…ncodeMemorySequence>(...)");
                sd011.getClass();
                return new C5811m3((QD0) value3, 2);
            case 10:
                VD0 vd09 = this.f;
                SD0 sd012 = vd09.b;
                ExecutorService executorService3 = (ExecutorService) sd012.i.a;
                O90.f(executorService3, "executor");
                VH vh3 = sd012.j;
                O90.f(vh3, "pooledByteBufferFactory");
                IC ic = new IC(executorService3, vh3, 1);
                SD0 sd013 = vd09.b;
                return vd09.f(ic, new InterfaceC3991ga1[]{new C0051Ak0((ExecutorService) sd013.i.a, sd013.j, sd013.a)});
            case 11:
                VD0 vd010 = this.f;
                SD0 sd014 = vd010.b;
                C7850wk0 c7850wk02 = new C7850wk0((ExecutorService) sd014.i.a, sd014.j, sd014.b);
                SD0 sd015 = vd010.b;
                return vd010.f(c7850wk02, new InterfaceC3991ga1[]{new C0051Ak0((ExecutorService) sd015.i.a, sd015.j, sd015.a)});
            case 12:
                if (Build.VERSION.SDK_INT < 29) {
                    throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                }
                VD0 vd011 = this.f;
                SD0 sd016 = vd011.b;
                return vd011.d(new C0363Ek0((ExecutorService) sd016.i.c, sd016.a, z ? 1 : 0));
            case 13:
                VD0 vd012 = this.f;
                SD0 sd017 = vd012.b;
                return vd012.d(new C0363Ek0((ExecutorService) sd017.i.a, sd017.a, i));
            case 14:
                AbstractC4368iZ.b();
                Object value4 = this.f.j.getValue();
                O90.e(value4, "<get-backgroundNetworkFe…codedMemorySequence>(...)");
                return new C5811m3((QD0) value4, 1);
            case 15:
                AbstractC4368iZ.b();
                VD0 vd013 = this.f;
                return vd013.e((QD0) vd013.l.getValue());
            case 16:
                AbstractC4368iZ.b();
                VD0 vd014 = this.f;
                SD0 sd018 = vd014.b;
                Object value5 = vd014.j.getValue();
                O90.e(value5, "<get-backgroundNetworkFe…codedMemorySequence>(...)");
                sd018.getClass();
                return new C5811m3((QD0) value5, 2);
            default:
                VD0 vd015 = this.f;
                SD0 sd019 = vd015.b;
                C8040xk0 c8040xk02 = new C8040xk0((ExecutorService) sd019.i.a, sd019.j, sd019.a, 1);
                SD0 sd020 = vd015.b;
                return vd015.f(c8040xk02, new InterfaceC3991ga1[]{new C0051Ak0((ExecutorService) sd020.i.a, sd020.j, sd020.a)});
        }
    }
}
