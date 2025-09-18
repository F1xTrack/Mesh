package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p000.AbstractC1607ZX;
import p000.AbstractC6750rY;
import p000.AbstractC7222ym;
import p000.C3935dY;
import p000.C6687qY;
import p000.C6830sY;
import p000.XG0;

/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C1732n implements LayoutInflater.Factory2 {

    /* renamed from: a */
    public final AbstractC1733o f16199a;

    public LayoutInflaterFactory2C1732n(AbstractC1733o abstractC1733o) {
        this.f16199a = abstractC1733o;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C1736r c1736rM10070f;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        AbstractC1733o abstractC1733o = this.f16199a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, abstractC1733o);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, XG0.f13648a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(C3935dY.m17705a(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentM10038A = resourceId != -1 ? abstractC1733o.m10038A(resourceId) : null;
                if (fragmentM10038A == null && string != null) {
                    fragmentM10038A = abstractC1733o.m10039B(string);
                }
                if (fragmentM10038A == null && id != -1) {
                    fragmentM10038A = abstractC1733o.m10038A(id);
                }
                if (fragmentM10038A == null) {
                    C3935dY c3935dYM10042F = abstractC1733o.m10042F();
                    context.getClassLoader();
                    fragmentM10038A = Fragment.instantiate(c3935dYM10042F.f26137a.f16232t.f14957b, attributeValue, null);
                    fragmentM10038A.mFromLayout = true;
                    fragmentM10038A.mFragmentId = resourceId != 0 ? resourceId : id;
                    fragmentM10038A.mContainerId = id;
                    fragmentM10038A.mTag = string;
                    fragmentM10038A.mInLayout = true;
                    fragmentM10038A.mFragmentManager = abstractC1733o;
                    AbstractC1607ZX abstractC1607ZX = abstractC1733o.f16232t;
                    fragmentM10038A.mHost = abstractC1607ZX;
                    fragmentM10038A.onInflate((Context) abstractC1607ZX.f14957b, attributeSet, fragmentM10038A.mSavedFragmentState);
                    c1736rM10070f = abstractC1733o.m10061a(fragmentM10038A);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragmentM10038A.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (fragmentM10038A.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    fragmentM10038A.mInLayout = true;
                    fragmentM10038A.mFragmentManager = abstractC1733o;
                    AbstractC1607ZX abstractC1607ZX2 = abstractC1733o.f16232t;
                    fragmentM10038A.mHost = abstractC1607ZX2;
                    fragmentM10038A.onInflate((Context) abstractC1607ZX2.f14957b, attributeSet, fragmentM10038A.mSavedFragmentState);
                    c1736rM10070f = abstractC1733o.m10070f(fragmentM10038A);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragmentM10038A.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C6687qY c6687qY = AbstractC6750rY.f41724a;
                AbstractC6750rY.m24399b(new C6830sY(fragmentM10038A, viewGroup, 0));
                AbstractC6750rY.m24398a(fragmentM10038A).getClass();
                fragmentM10038A.mContainer = viewGroup;
                c1736rM10070f.m10102i();
                c1736rM10070f.m10101h();
                View view2 = fragmentM10038A.mView;
                if (view2 == null) {
                    throw new IllegalStateException(AbstractC7222ym.m26234k("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentM10038A.mView.getTag() == null) {
                    fragmentM10038A.mView.setTag(string);
                }
                fragmentM10038A.mView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1731m(this, c1736rM10070f));
                return fragmentM10038A.mView;
            }
        }
        return null;
    }
}
