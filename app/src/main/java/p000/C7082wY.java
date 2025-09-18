package p000;

import android.graphics.Rect;
import android.transition.Transition;

/* renamed from: wY */
/* loaded from: classes.dex */
public final class C7082wY extends Transition.EpicenterCallback {

    /* renamed from: a */
    public final /* synthetic */ int f44953a;

    /* renamed from: b */
    public final /* synthetic */ Rect f44954b;

    public /* synthetic */ C7082wY(int i, Rect rect) {
        this.f44953a = i;
        this.f44954b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f44953a) {
            case 0:
                return this.f44954b;
            default:
                Rect rect = this.f44954b;
                if (rect == null || rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
