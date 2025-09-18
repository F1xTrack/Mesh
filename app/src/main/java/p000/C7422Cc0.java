package p000;

import android.content.Context;
import com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: Cc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C7422Cc0 extends AbstractC9714i71 implements Function2 {

    /* renamed from: a */
    public InterfaceC7924Lt0 f1474a;

    /* renamed from: b */
    public Object f1475b;

    /* renamed from: c */
    public Object f1476c;

    /* renamed from: d */
    public int f1477d;

    /* renamed from: e */
    public final /* synthetic */ JsonSerializableFileDataStoreImpl f1478e;

    /* renamed from: f */
    public final /* synthetic */ Context f1479f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7422Cc0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, Context context, InterfaceC1382Vy interfaceC1382Vy) {
        super(2, interfaceC1382Vy);
        this.f1478e = jsonSerializableFileDataStoreImpl;
        this.f1479f = context;
    }

    @Override // p000.AbstractC1300Uf
    public final InterfaceC1382Vy create(Object obj, InterfaceC1382Vy interfaceC1382Vy) {
        return new C7422Cc0(this.f1478e, this.f1479f, interfaceC1382Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C7422Cc0) create((InterfaceC0754Lz) obj, (InterfaceC1382Vy) obj2)).invokeSuspend(C8313Tf1.f11463a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|2|(1:(3:(1:(1:(6:8|65|9|52|55|56)(2:13|14))(10:15|59|16|17|41|(1:43)|44|(2:48|(1:50)(2:51|52))|55|56))(8:21|61|22|23|35|(2:37|(1:39)(5:40|41|(0)|44|(3:46|48|(0)(0))))|55|56)|57|58)(1:26))(2:27|(1:29)(1:30))|63|31|(1:33)(5:34|35|(0)|55|56)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ec, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a3 A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:41:0x00b7, B:43:0x00c2, B:44:0x00d1, B:46:0x00d5, B:48:0x00da, B:35:0x009b, B:37:0x00a3, B:31:0x0087), top: B:63:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2 A[Catch: all -> 0x00ec, TryCatch #2 {all -> 0x00ec, blocks: (B:41:0x00b7, B:43:0x00c2, B:44:0x00d1, B:46:0x00d5, B:48:0x00da, B:35:0x009b, B:37:0x00a3, B:31:0x0087), top: B:63:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9, types: [Lt0] */
    /* JADX WARN: Type inference failed for: r4v10, types: [Lt0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [Lt0] */
    /* JADX WARN: Type inference failed for: r7v6, types: [Lt0] */
    @Override // p000.AbstractC1300Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7422Cc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
