package p000;

import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1733o;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: MB */
/* loaded from: classes2.dex */
public final class C0767MB {

    /* renamed from: a */
    public boolean f7026a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f7027b;

    /* renamed from: c */
    public AbstractC0351FZ f7028c;

    /* renamed from: d */
    public final /* synthetic */ int f7029d;

    /* renamed from: e */
    public final /* synthetic */ Object f7030e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0767MB(ViewGroup viewGroup, int i) {
        this(true);
        this.f7029d = i;
        this.f7030e = viewGroup;
    }

    /* renamed from: a */
    public final void m5283a() {
        switch (this.f7029d) {
            case 0:
                ((C0830NB) this.f7030e).setIconified(true);
                break;
            case 1:
                AbstractC1733o abstractC1733o = (AbstractC1733o) this.f7030e;
                abstractC1733o.m10088x(true);
                if (!abstractC1733o.f16220h.f7026a) {
                    abstractC1733o.f16219g.m9821c();
                    break;
                } else {
                    abstractC1733o.m10049O();
                    break;
                }
            default:
                ((C10891rK0) this.f7030e).setFullscreen(false);
                break;
        }
    }

    public C0767MB(boolean z) {
        this.f7026a = z;
        this.f7027b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0767MB(AbstractC1733o abstractC1733o) {
        this(false);
        this.f7029d = 1;
        this.f7030e = abstractC1733o;
    }
}
