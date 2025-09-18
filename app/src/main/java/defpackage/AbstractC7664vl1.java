package defpackage;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import ru.mes.dnevnik.R;

/* renamed from: vl1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7664vl1 implements A81 {
    public final ImageView a;
    public final C7473ul1 b;

    public AbstractC7664vl1(ImageView imageView) {
        IL1.d(imageView, "Argument must not be null");
        this.a = imageView;
        this.b = new C7473ul1(imageView);
    }

    @Override // defpackage.A81
    public final void a(J11 j11) {
        this.b.b.remove(j11);
    }

    @Override // defpackage.A81
    public final void b(J11 j11) throws Throwable {
        C7473ul1 c7473ul1 = this.b;
        ImageView imageView = c7473ul1.a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int iA = c7473ul1.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = c7473ul1.a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int iA2 = c7473ul1.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            j11.n(iA, iA2);
            return;
        }
        ArrayList arrayList = c7473ul1.b;
        if (!arrayList.contains(j11)) {
            arrayList.add(j11);
        }
        if (c7473ul1.c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            ViewTreeObserverOnPreDrawListenerC2279bC viewTreeObserverOnPreDrawListenerC2279bC = new ViewTreeObserverOnPreDrawListenerC2279bC(c7473ul1);
            c7473ul1.c = viewTreeObserverOnPreDrawListenerC2279bC;
            viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC2279bC);
        }
    }

    @Override // defpackage.A81
    public final void c(InterfaceC6839rR0 interfaceC6839rR0) {
        this.a.setTag(R.id.glide_custom_view_target_tag, interfaceC6839rR0);
    }

    @Override // defpackage.A81
    public final InterfaceC6839rR0 h() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof InterfaceC6839rR0) {
            return (InterfaceC6839rR0) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final String toString() {
        return "Target for: " + this.a;
    }

    @Override // defpackage.InterfaceC0747Ji0
    public final void onDestroy() {
    }
}
