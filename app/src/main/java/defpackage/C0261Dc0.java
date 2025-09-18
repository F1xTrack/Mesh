package defpackage;

import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl;
import kotlin.jvm.functions.Function2;

/* renamed from: Dc0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0261Dc0 extends AbstractC4286i71 implements Function2 {
    public InterfaceC0935Lt0 a;
    public JsonSerializableFileDataStoreImpl b;
    public int c;
    public final /* synthetic */ JsonSerializableFileDataStoreImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0261Dc0(JsonSerializableFileDataStoreImpl jsonSerializableFileDataStoreImpl, InterfaceC1729Vy interfaceC1729Vy) {
        super(2, interfaceC1729Vy);
        this.d = jsonSerializableFileDataStoreImpl;
    }

    @Override // defpackage.AbstractC1594Uf
    public final InterfaceC1729Vy create(Object obj, InterfaceC1729Vy interfaceC1729Vy) {
        return new C0261Dc0(this.d, interfaceC1729Vy);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0261Dc0) create((InterfaceC0952Lz) obj, (InterfaceC1729Vy) obj2)).invokeSuspend(C1518Tf1.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Type inference failed for: r3v2, types: [Lt0] */
    @Override // defpackage.AbstractC1594Uf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            Mz r0 = defpackage.EnumC1030Mz.a
            int r1 = r6.c
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2a
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            Lt0 r0 = r6.a
            defpackage.RQ1.d(r7)     // Catch: java.lang.Throwable -> L17
            PS0 r7 = (defpackage.PS0) r7     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = r7.a     // Catch: java.lang.Throwable -> L17
            goto L51
        L17:
            r7 = move-exception
            goto L63
        L19:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L21:
            com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r1 = r6.b
            Lt0 r3 = r6.a
            defpackage.RQ1.d(r7)
            r7 = r3
            goto L42
        L2a:
            defpackage.RQ1.d(r7)
            com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl r1 = r6.d
            Lt0 r7 = com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl.access$getMutex$p(r1)
            r6.a = r7
            r6.b = r1
            r6.c = r3
            Nt0 r7 = (defpackage.C1091Nt0) r7
            java.lang.Object r3 = r7.d(r6)
            if (r3 != r0) goto L42
            return r0
        L42:
            r6.a = r7     // Catch: java.lang.Throwable -> L5f
            r6.b = r4     // Catch: java.lang.Throwable -> L5f
            r6.c = r2     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r1 = com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImpl.m79access$readUnsafeIoAF18A(r1, r6)     // Catch: java.lang.Throwable -> L5f
            if (r1 != r0) goto L4f
            return r0
        L4f:
            r0 = r7
            r7 = r1
        L51:
            boolean r1 = r7 instanceof defpackage.OS0     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L57
            r7 = r4
        L57:
            com.vk.push.core.filedatastore.JsonSerializer r7 = (com.vk.push.core.filedatastore.JsonSerializer) r7     // Catch: java.lang.Throwable -> L17
            Nt0 r0 = (defpackage.C1091Nt0) r0
            r0.e(r4)
            return r7
        L5f:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L63:
            Nt0 r0 = (defpackage.C1091Nt0) r0
            r0.e(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0261Dc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
