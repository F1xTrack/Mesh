package defpackage;

import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class BG implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ BG(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AbstractC7623vY.a(4, this.b);
                break;
            default:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((ViewManager) it.next()).invalidate();
                }
                break;
        }
    }
}
