package defpackage;

import android.content.Context;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: Cc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0183Cc0 extends AbstractC4286i71 implements Function2 {
    public InterfaceC0935Lt0 a;
    public Object b;
    public Object c;
    public int d;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl e;
    public final /* synthetic */ Context f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183Cc0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, Context context, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.e = jsonSerializableFileDataStoreImpl;
        this.f = context;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0183Cc0(this.e, this.f, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0183Cc0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
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
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0183Cc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
