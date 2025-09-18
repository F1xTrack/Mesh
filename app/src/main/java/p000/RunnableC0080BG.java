package p000;

import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: BG */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0080BG implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f692a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f693b;

    public /* synthetic */ RunnableC0080BG(ArrayList arrayList, int i) {
        this.f692a = i;
        this.f693b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f692a) {
            case 0:
                AbstractC7019vY.m25442a(4, this.f693b);
                break;
            default:
                Iterator it = this.f693b.iterator();
                while (it.hasNext()) {
                    ((ViewManager) it.next()).invalidate();
                }
                break;
        }
    }
}
