package defpackage;

import android.view.ViewGroup;
import androidx.fragment.app.o;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class MB {
    public boolean a;
    public final CopyOnWriteArrayList b;
    public FZ c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MB(ViewGroup viewGroup, int i) {
        this(true);
        this.d = i;
        this.e = viewGroup;
    }

    public final void a() {
        switch (this.d) {
            case 0:
                ((NB) this.e).setIconified(true);
                break;
            case 1:
                o oVar = (o) this.e;
                oVar.x(true);
                if (!oVar.h.a) {
                    oVar.g.c();
                    break;
                } else {
                    oVar.O();
                    break;
                }
            default:
                ((C6818rK0) this.e).setFullscreen(false);
                break;
        }
    }

    public MB(boolean z) {
        this.a = z;
        this.b = new CopyOnWriteArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MB(o oVar) {
        this(false);
        this.d = 1;
        this.e = oVar;
    }
}
