package defpackage;

import com.vk.push.core.deviceid.DeviceIdRepositoryImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: nJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6051nJ extends AbstractC4286i71 implements Function2 {
    public InterfaceC0935Lt0 a;
    public DeviceIdRepositoryImpl b;
    public Object c;
    public Throwable d;
    public int e;
    public final /* synthetic */ DeviceIdRepositoryImpl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6051nJ(DeviceIdRepositoryImpl deviceIdRepositoryImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.f = deviceIdRepositoryImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C6051nJ(this.f, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6051nJ) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 7, insn: 0x0066: MOVE (r2 I:??[OBJECT, ARRAY]) = (r7 I:??[OBJECT, ARRAY]) (LINE:103), block:B:29:0x0066 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[Catch: all -> 0x00b2, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:41:0x00a2, B:43:0x00a8, B:48:0x00b7), top: B:100:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7 A[Catch: all -> 0x00b2, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00b2, blocks: (B:41:0x00a2, B:43:0x00a8, B:48:0x00b7), top: B:100:0x00a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:26:0x0060, B:64:0x0110, B:31:0x006d, B:52:0x00cb, B:54:0x00cf, B:56:0x00d8, B:59:0x00ed, B:61:0x00f3), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3 A[Catch: all -> 0x0065, TryCatch #2 {all -> 0x0065, blocks: (B:26:0x0060, B:64:0x0110, B:31:0x006d, B:52:0x00cb, B:54:0x00cf, B:56:0x00d8, B:59:0x00ed, B:61:0x00f3), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013f A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x001f, B:95:0x01d8, B:12:0x002b, B:92:0x01c4, B:89:0x01a9, B:20:0x0048, B:78:0x0163, B:23:0x0051, B:70:0x013b, B:72:0x013f, B:74:0x0148, B:81:0x016d, B:83:0x0173, B:66:0x0124), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0173 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x001f, B:95:0x01d8, B:12:0x002b, B:92:0x01c4, B:89:0x01a9, B:20:0x0048, B:78:0x0163, B:23:0x0051, B:70:0x013b, B:72:0x013f, B:74:0x0148, B:81:0x016d, B:83:0x0173, B:66:0x0124), top: B:101:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r7v7, types: [Lt0] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6051nJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
