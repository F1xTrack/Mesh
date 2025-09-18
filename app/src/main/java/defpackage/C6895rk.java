package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: rk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6895rk implements KC {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C6895rk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.KC
    public final Class a() {
        switch (this.a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.b.getClass();
        }
    }

    @Override // defpackage.KC
    public final void b() {
        int i = this.a;
    }

    @Override // defpackage.KC
    public final void c(EnumC7561vD0 enumC7561vD0, JC jc) {
        switch (this.a) {
            case 0:
                try {
                    jc.j(AbstractC7659vk.a((File) this.b));
                    break;
                } catch (IOException e) {
                    jc.e(e);
                    return;
                }
            default:
                jc.j(this.b);
                break;
        }
    }

    @Override // defpackage.KC
    public final void cancel() {
        int i = this.a;
    }

    @Override // defpackage.KC
    public final XC d() {
        switch (this.a) {
        }
        return XC.a;
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}
