package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: Rf */
/* loaded from: classes.dex */
public abstract class AbstractC1111Rf implements InterfaceC6832sa {

    /* renamed from: b */
    public C6689qa f10362b;

    /* renamed from: c */
    public C6689qa f10363c;

    /* renamed from: d */
    public C6689qa f10364d;

    /* renamed from: e */
    public C6689qa f10365e;

    /* renamed from: f */
    public ByteBuffer f10366f;

    /* renamed from: g */
    public ByteBuffer f10367g;

    /* renamed from: h */
    public boolean f10368h;

    public AbstractC1111Rf() {
        ByteBuffer byteBuffer = InterfaceC6832sa.f42484a;
        this.f10366f = byteBuffer;
        this.f10367g = byteBuffer;
        C6689qa c6689qa = C6689qa.f41025e;
        this.f10364d = c6689qa;
        this.f10365e = c6689qa;
        this.f10362b = c6689qa;
        this.f10363c = c6689qa;
    }

    /* renamed from: a */
    public abstract C6689qa mo3679a(C6689qa c6689qa);

    @Override // p000.InterfaceC6832sa
    /* renamed from: d */
    public final void mo7054d() {
        flush();
        this.f10366f = InterfaceC6832sa.f42484a;
        C6689qa c6689qa = C6689qa.f41025e;
        this.f10364d = c6689qa;
        this.f10365e = c6689qa;
        this.f10362b = c6689qa;
        this.f10363c = c6689qa;
        mo3683j();
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: e */
    public ByteBuffer mo7055e() {
        ByteBuffer byteBuffer = this.f10367g;
        this.f10367g = InterfaceC6832sa.f42484a;
        return byteBuffer;
    }

    @Override // p000.InterfaceC6832sa
    public final void flush() {
        this.f10367g = InterfaceC6832sa.f42484a;
        this.f10368h = false;
        this.f10362b = this.f10364d;
        this.f10363c = this.f10365e;
        mo3680b();
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: g */
    public final C6689qa mo7056g(C6689qa c6689qa) {
        this.f10364d = c6689qa;
        this.f10365e = mo3679a(c6689qa);
        return isActive() ? this.f10365e : C6689qa.f41025e;
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: h */
    public final void mo7057h() {
        this.f10368h = true;
        mo3681c();
    }

    @Override // p000.InterfaceC6832sa
    /* renamed from: i */
    public boolean mo7058i() {
        return this.f10368h && this.f10367g == InterfaceC6832sa.f42484a;
    }

    @Override // p000.InterfaceC6832sa
    public boolean isActive() {
        return this.f10365e != C6689qa.f41025e;
    }

    /* renamed from: k */
    public final ByteBuffer m7059k(int i) {
        if (this.f10366f.capacity() < i) {
            this.f10366f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f10366f.clear();
        }
        ByteBuffer byteBuffer = this.f10366f;
        this.f10367g = byteBuffer;
        return byteBuffer;
    }

    /* renamed from: b */
    public void mo3680b() {
    }

    /* renamed from: c */
    public void mo3681c() {
    }

    /* renamed from: j */
    public void mo3683j() {
    }
}
