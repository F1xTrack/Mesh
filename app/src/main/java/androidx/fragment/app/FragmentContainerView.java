package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import p000.AbstractC10944rk1;
import p000.AbstractC7222ym;
import p000.AbstractC9280ek1;
import p000.C3935dY;
import p000.C8433Vn1;
import p000.O90;
import p000.XG0;
import ru.mes.dnevnik.R;

@Metadata(m22266d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0010*\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m22267d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "LTf1;", "setLayoutTransition", "(Landroid/animation/LayoutTransition;)V", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "(Landroid/view/View$OnApplyWindowInsetsListener;)V", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "(Z)V", "Landroidx/fragment/app/Fragment;", "F", "getFragment", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, m22268k = 1, m22269mv = {1, 8, 0}, m22271xi = 48)
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a */
    public final ArrayList f16154a;

    /* renamed from: b */
    public final ArrayList f16155b;

    /* renamed from: c */
    public View.OnApplyWindowInsetsListener f16156c;

    /* renamed from: d */
    public boolean f16157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        O90.m5968f(context, "context");
        this.f16154a = new ArrayList();
        this.f16155b = new ArrayList();
        this.f16157d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, XG0.f13649b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* renamed from: a */
    public final void m10011a(View view) {
        if (this.f16155b.contains(view)) {
            this.f16154a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        O90.m5968f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C8433Vn1 c8433Vn1M24477i;
        O90.m5968f(windowInsets, "insets");
        C8433Vn1 c8433Vn1M8551h = C8433Vn1.m8551h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f16156c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            O90.m5967e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            c8433Vn1M24477i = C8433Vn1.m8551h(null, windowInsetsOnApplyWindowInsets);
        } else {
            c8433Vn1M24477i = AbstractC10944rk1.m24477i(this, c8433Vn1M8551h);
        }
        O90.m5967e(c8433Vn1M24477i, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c8433Vn1M24477i.f12756a.mo6142m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap = AbstractC10944rk1.f41842a;
                WindowInsets windowInsetsM8557g = c8433Vn1M24477i.m8557g();
                if (windowInsetsM8557g != null) {
                    WindowInsets windowInsetsM18027a = AbstractC9280ek1.m18027a(childAt, windowInsetsM8557g);
                    if (!windowInsetsM18027a.equals(windowInsetsM8557g)) {
                        C8433Vn1.m8551h(childAt, windowInsetsM18027a);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        O90.m5968f(canvas, "canvas");
        if (this.f16157d) {
            Iterator it = this.f16154a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        O90.m5968f(canvas, "canvas");
        O90.m5968f(view, "child");
        if (this.f16157d) {
            ArrayList arrayList = this.f16154a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        O90.m5968f(view, "view");
        this.f16155b.remove(view);
        if (this.f16154a.remove(view)) {
            this.f16157d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        AbstractActivityC1730l abstractActivityC1730l;
        AbstractC1733o abstractC1733oM10034e;
        Fragment fragmentM10035C = AbstractC1733o.m10035C(this);
        if (fragmentM10035C == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    abstractActivityC1730l = null;
                    break;
                }
                if (context instanceof AbstractActivityC1730l) {
                    abstractActivityC1730l = (AbstractActivityC1730l) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC1730l == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            abstractC1733oM10034e = abstractActivityC1730l.m10034e();
        } else {
            if (!fragmentM10035C.isAdded()) {
                throw new IllegalStateException("The Fragment " + fragmentM10035C + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            abstractC1733oM10034e = fragmentM10035C.getChildFragmentManager();
        }
        return (F) abstractC1733oM10034e.m10038A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        O90.m5968f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                O90.m5967e(childAt, "view");
                m10011a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        O90.m5968f(view, "view");
        m10011a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        O90.m5967e(childAt, "view");
        m10011a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        O90.m5968f(view, "view");
        m10011a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            O90.m5967e(childAt, "view");
            m10011a(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            O90.m5967e(childAt, "view");
            m10011a(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean drawDisappearingViewsFirst) {
        this.f16157d = drawDisappearingViewsFirst;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition transition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        O90.m5968f(onApplyWindowInsetsListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f16156c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        O90.m5968f(view, "view");
        if (view.getParent() == this) {
            this.f16155b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC1733o abstractC1733o) {
        View view;
        super(context, attributeSet);
        O90.m5968f(context, "context");
        O90.m5968f(attributeSet, "attrs");
        O90.m5968f(abstractC1733o, "fm");
        this.f16154a = new ArrayList();
        this.f16155b = new ArrayList();
        this.f16157d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, XG0.f13649b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentM10038A = abstractC1733o.m10038A(id);
        if (classAttribute != null && fragmentM10038A == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC7222ym.m26234k("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C3935dY c3935dYM10042F = abstractC1733o.m10042F();
            context.getClassLoader();
            Fragment fragmentInstantiate = Fragment.instantiate(c3935dYM10042F.f26137a.f16232t.f14957b, classAttribute, null);
            O90.m5967e(fragmentInstantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            fragmentInstantiate.onInflate(context, attributeSet, (Bundle) null);
            C1719a c1719a = new C1719a(abstractC1733o);
            c1719a.f43746o = true;
            fragmentInstantiate.mContainer = this;
            c1719a.mo10013c(getId(), fragmentInstantiate, string, 1);
            c1719a.m10016g();
        }
        Iterator it = abstractC1733o.f16215c.m10110d().iterator();
        while (it.hasNext()) {
            C1736r c1736r = (C1736r) it.next();
            Fragment fragment = c1736r.f16262c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                c1736r.m10094a();
            }
        }
    }
}
