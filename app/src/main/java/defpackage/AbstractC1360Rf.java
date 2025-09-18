package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: Rf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1360Rf implements InterfaceC7056sa {
    public C6675qa b;
    public C6675qa c;
    public C6675qa d;
    public C6675qa e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public AbstractC1360Rf() {
        ByteBuffer byteBuffer = InterfaceC7056sa.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        C6675qa c6675qa = C6675qa.e;
        this.d = c6675qa;
        this.e = c6675qa;
        this.b = c6675qa;
        this.c = c6675qa;
    }

    public abstract C6675qa a(C6675qa c6675qa);

    @Override // defpackage.InterfaceC7056sa
    public final void d() {
        flush();
        this.f = InterfaceC7056sa.a;
        C6675qa c6675qa = C6675qa.e;
        this.d = c6675qa;
        this.e = c6675qa;
        this.b = c6675qa;
        this.c = c6675qa;
        j();
    }

    @Override // defpackage.InterfaceC7056sa
    public ByteBuffer e() {
        ByteBuffer byteBuffer = this.g;
        this.g = InterfaceC7056sa.a;
        return byteBuffer;
    }

    @Override // defpackage.InterfaceC7056sa
    public final void flush() {
        this.g = InterfaceC7056sa.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        b();
    }

    @Override // defpackage.InterfaceC7056sa
    public final C6675qa g(C6675qa c6675qa) {
        this.d = c6675qa;
        this.e = a(c6675qa);
        return isActive() ? this.e : C6675qa.e;
    }

    @Override // defpackage.InterfaceC7056sa
    public final void h() {
        this.h = true;
        c();
    }

    @Override // defpackage.InterfaceC7056sa
    public boolean i() {
        return this.h && this.g == InterfaceC7056sa.a;
    }

    @Override // defpackage.InterfaceC7056sa
    public boolean isActive() {
        return this.e != C6675qa.e;
    }

    public final ByteBuffer k(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    public void b() {
    }

    public void c() {
    }

    public void j() {
    }
}
