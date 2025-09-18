package p000;

import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class SQ0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public TO0 f10760a;

    /* renamed from: b */
    public TO0 f10761b;

    /* renamed from: c */
    public int f10762c;

    /* renamed from: d */
    public /* synthetic */ Object f10763d;

    /* renamed from: e */
    public final /* synthetic */ UQ0 f10764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SQ0(UQ0 uq0, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f10764e = uq0;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        SQ0 sq0 = new SQ0(this.f10764e, interfaceC1382Vy);
        sq0.f10763d = obj;
        return sq0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SQ0) create((JSONObject) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0196 A[RETURN] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.SQ0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
