package p000;

import android.util.Pair;

/* renamed from: ba1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8871ba1 extends AbstractC7254zH {

    /* renamed from: c */
    public final /* synthetic */ C8999ca1 f17077c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8871ba1(C8999ca1 c8999ca1, AbstractC1237Tf abstractC1237Tf) {
        super(abstractC1237Tf);
        this.f17077c = c8999ca1;
    }

    @Override // p000.AbstractC7254zH, p000.AbstractC1237Tf
    /* renamed from: d */
    public final void mo6844d() {
        this.f46773b.m7717c();
        m10462m();
    }

    @Override // p000.AbstractC7254zH, p000.AbstractC1237Tf
    /* renamed from: f */
    public final void mo6845f(Throwable th) {
        this.f46773b.m7718e(th);
        m10462m();
    }

    @Override // p000.AbstractC1237Tf
    /* renamed from: h */
    public final void mo6846h(int i, Object obj) {
        this.f46773b.m7719g(i, obj);
        if (AbstractC1237Tf.m7714a(i)) {
            m10462m();
        }
    }

    /* renamed from: m */
    public final void m10462m() {
        Pair pair;
        synchronized (this.f17077c) {
            try {
                pair = (Pair) this.f17077c.f17629c.poll();
                if (pair == null) {
                    C8999ca1 c8999ca1 = this.f17077c;
                    c8999ca1.f17628b--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pair != null) {
            this.f17077c.f17630d.execute(new RunnableC1483XZ(this, pair, false, 21));
        }
    }
}
