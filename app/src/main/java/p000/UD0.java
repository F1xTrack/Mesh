package p000;

import android.content.ContentResolver;
import android.os.Build;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class UD0 extends AbstractC8418Vg0 implements InterfaceC6434mZ {

    /* renamed from: e */
    public final /* synthetic */ int f11694e;

    /* renamed from: f */
    public final /* synthetic */ VD0 f11695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UD0(VD0 vd0, int i) {
        super(0);
        this.f11694e = i;
        this.f11695f = vd0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() throws Throwable {
        C8854bS0 c8854bS0M7197a;
        boolean z = false;
        z = false;
        int i = 1;
        switch (this.f11694e) {
            case 0:
                AbstractC4250iZ.m19063b();
                VD0 vd0 = this.f11695f;
                SD0 sd0 = vd0.f12417b;
                C4259ii c4259iiM8335g = vd0.m8335g(new C11709xk0((ExecutorService) sd0.f10631i.f43616a, sd0.f10632j, sd0.f10623a, 0));
                vd0.f12417b.getClass();
                return new W91(c4259iiM8335g, vd0.f12420e);
            case 1:
                AbstractC4250iZ.m19063b();
                VD0 vd02 = this.f11695f;
                SD0 sd02 = vd02.f12417b;
                ExecutorService executorService = (ExecutorService) sd02.f10631i.f43616a;
                O90.m5968f(executorService, "executor");
                C1339VH c1339vh = sd02.f10632j;
                O90.m5968f(c1339vh, "pooledByteBufferFactory");
                C4259ii c4259iiM8335g2 = vd02.m8335g(new C0517IC(executorService, c1339vh, 1));
                vd02.f12417b.getClass();
                return new W91(c4259iiM8335g2, vd02.f12420e);
            case 2:
                AbstractC4250iZ.m19063b();
                VD0 vd03 = this.f11695f;
                SD0 sd03 = vd03.f12417b;
                QD0 qd0 = (QD0) vd03.f12427l.getValue();
                sd03.getClass();
                return new W91(qd0, vd03.f12420e);
            case 3:
                AbstractC4250iZ.m19063b();
                VD0 vd04 = this.f11695f;
                AbstractC11920zO1 abstractC11920zO1 = vd04.f12418c;
                synchronized (vd04) {
                    try {
                        O90.m5968f(abstractC11920zO1, "networkFetcher");
                        AbstractC4250iZ.m19063b();
                        SD0 sd04 = vd04.f12417b;
                        C6402m3 c6402m3 = new C6402m3(vd04.m8335g(new C8290Su0(sd04.f10632j, sd04.f10626d, abstractC11920zO1, z ? 1 : 0)), 0);
                        SD0 sd05 = vd04.f12417b;
                        if (vd04.f12419d && vd04.f12439x != 3) {
                            z = true;
                        }
                        c8854bS0M7197a = sd05.m7197a(c6402m3, z, vd04.f12422g);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return c8854bS0M7197a;
            case 4:
                VD0 vd05 = this.f11695f;
                SD0 sd06 = vd05.f12417b;
                sd06.getClass();
                return vd05.m8333e(vd05.f12417b.m7197a(new C6402m3(new C0517IC(C1685am.f15687a, sd06.f10632j, 0), 0), true, vd05.f12422g));
            case 5:
                VD0 vd06 = this.f11695f;
                SD0 sd07 = vd06.f12417b;
                C11582wk0 c11582wk0 = new C11582wk0((ExecutorService) sd07.f10631i.f43616a, sd07.f10632j, sd07.f10625c);
                SD0 sd08 = vd06.f12417b;
                return vd06.m8334f(c11582wk0, new InterfaceC9516ga1[]{new C7334Ak0((ExecutorService) sd08.f10631i.f43616a, sd08.f10632j, sd08.f10623a)});
            case 6:
                AbstractC4250iZ.m19063b();
                Object value = this.f11695f.f12430o.getValue();
                O90.m5967e(value, "<get-backgroundLocalCont…ncodeMemorySequence>(...)");
                return new C6402m3((QD0) value, 1);
            case 7:
                VD0 vd07 = this.f11695f;
                SD0 sd09 = vd07.f12417b;
                C11709xk0 c11709xk0 = new C11709xk0((ExecutorService) sd09.f10631i.f43616a, sd09.f10632j, sd09.f10623a, 0);
                SD0 sd010 = vd07.f12417b;
                sd010.getClass();
                ExecutorService executorService2 = (ExecutorService) sd010.f10631i.f43616a;
                ContentResolver contentResolver = sd010.f10623a;
                C1339VH c1339vh2 = sd010.f10632j;
                return vd07.m8334f(c11709xk0, new InterfaceC9516ga1[]{new C11836yk0(executorService2, c1339vh2, contentResolver), new C7334Ak0(executorService2, c1339vh2, contentResolver)});
            case 8:
                AbstractC4250iZ.m19063b();
                Object value2 = this.f11695f.f12429n.getValue();
                O90.m5967e(value2, "<get-backgroundLocalFile…ncodeMemorySequence>(...)");
                return new C6402m3((QD0) value2, 1);
            case 9:
                AbstractC4250iZ.m19063b();
                VD0 vd08 = this.f11695f;
                SD0 sd011 = vd08.f12417b;
                Object value3 = vd08.f12429n.getValue();
                O90.m5967e(value3, "<get-backgroundLocalFile…ncodeMemorySequence>(...)");
                sd011.getClass();
                return new C6402m3((QD0) value3, 2);
            case 10:
                VD0 vd09 = this.f11695f;
                SD0 sd012 = vd09.f12417b;
                ExecutorService executorService3 = (ExecutorService) sd012.f10631i.f43616a;
                O90.m5968f(executorService3, "executor");
                C1339VH c1339vh3 = sd012.f10632j;
                O90.m5968f(c1339vh3, "pooledByteBufferFactory");
                C0517IC c0517ic = new C0517IC(executorService3, c1339vh3, 1);
                SD0 sd013 = vd09.f12417b;
                return vd09.m8334f(c0517ic, new InterfaceC9516ga1[]{new C7334Ak0((ExecutorService) sd013.f10631i.f43616a, sd013.f10632j, sd013.f10623a)});
            case 11:
                VD0 vd010 = this.f11695f;
                SD0 sd014 = vd010.f12417b;
                C11582wk0 c11582wk02 = new C11582wk0((ExecutorService) sd014.f10631i.f43616a, sd014.f10632j, sd014.f10624b);
                SD0 sd015 = vd010.f12417b;
                return vd010.m8334f(c11582wk02, new InterfaceC9516ga1[]{new C7334Ak0((ExecutorService) sd015.f10631i.f43616a, sd015.f10632j, sd015.f10623a)});
            case 12:
                if (Build.VERSION.SDK_INT < 29) {
                    throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
                }
                VD0 vd011 = this.f11695f;
                SD0 sd016 = vd011.f12417b;
                return vd011.m8332d(new C7542Ek0((ExecutorService) sd016.f10631i.f43618c, sd016.f10623a, z ? 1 : 0));
            case 13:
                VD0 vd012 = this.f11695f;
                SD0 sd017 = vd012.f12417b;
                return vd012.m8332d(new C7542Ek0((ExecutorService) sd017.f10631i.f43616a, sd017.f10623a, i));
            case 14:
                AbstractC4250iZ.m19063b();
                Object value4 = this.f11695f.f12425j.getValue();
                O90.m5967e(value4, "<get-backgroundNetworkFe…codedMemorySequence>(...)");
                return new C6402m3((QD0) value4, 1);
            case 15:
                AbstractC4250iZ.m19063b();
                VD0 vd013 = this.f11695f;
                return vd013.m8333e((QD0) vd013.f12427l.getValue());
            case 16:
                AbstractC4250iZ.m19063b();
                VD0 vd014 = this.f11695f;
                SD0 sd018 = vd014.f12417b;
                Object value5 = vd014.f12425j.getValue();
                O90.m5967e(value5, "<get-backgroundNetworkFe…codedMemorySequence>(...)");
                sd018.getClass();
                return new C6402m3((QD0) value5, 2);
            default:
                VD0 vd015 = this.f11695f;
                SD0 sd019 = vd015.f12417b;
                C11709xk0 c11709xk02 = new C11709xk0((ExecutorService) sd019.f10631i.f43616a, sd019.f10632j, sd019.f10623a, 1);
                SD0 sd020 = vd015.f12417b;
                return vd015.m8334f(c11709xk02, new InterfaceC9516ga1[]{new C7334Ak0((ExecutorService) sd020.f10631i.f43616a, sd020.f10632j, sd020.f10623a)});
        }
    }
}
