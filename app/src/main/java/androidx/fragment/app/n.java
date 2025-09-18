package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.AbstractC6859rY;
import defpackage.AbstractC8235ym;
import defpackage.C3411dY;
import defpackage.C6669qY;
import defpackage.C7050sY;
import defpackage.XG0;
import defpackage.ZX;

/* loaded from: classes.dex */
public final class n implements LayoutInflater.Factory2 {
    public final o a;

    public n(o oVar) {
        this.a = oVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        r rVarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        o oVar = this.a;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, oVar);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, XG0.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = Fragment.class.isAssignableFrom(C3411dY.a(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment fragmentA = resourceId != -1 ? oVar.A(resourceId) : null;
                if (fragmentA == null && string != null) {
                    fragmentA = oVar.B(string);
                }
                if (fragmentA == null && id != -1) {
                    fragmentA = oVar.A(id);
                }
                if (fragmentA == null) {
                    C3411dY c3411dYF = oVar.F();
                    context.getClassLoader();
                    fragmentA = Fragment.instantiate(c3411dYF.a.t.b, attributeValue, null);
                    fragmentA.mFromLayout = true;
                    fragmentA.mFragmentId = resourceId != 0 ? resourceId : id;
                    fragmentA.mContainerId = id;
                    fragmentA.mTag = string;
                    fragmentA.mInLayout = true;
                    fragmentA.mFragmentManager = oVar;
                    ZX zx = oVar.t;
                    fragmentA.mHost = zx;
                    fragmentA.onInflate((Context) zx.b, attributeSet, fragmentA.mSavedFragmentState);
                    rVarF = oVar.a(fragmentA);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragmentA.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (fragmentA.mInLayout) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    fragmentA.mInLayout = true;
                    fragmentA.mFragmentManager = oVar;
                    ZX zx2 = oVar.t;
                    fragmentA.mHost = zx2;
                    fragmentA.onInflate((Context) zx2.b, attributeSet, fragmentA.mSavedFragmentState);
                    rVarF = oVar.f(fragmentA);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        fragmentA.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C6669qY c6669qY = AbstractC6859rY.a;
                AbstractC6859rY.b(new C7050sY(fragmentA, viewGroup, 0));
                AbstractC6859rY.a(fragmentA).getClass();
                fragmentA.mContainer = viewGroup;
                rVarF.i();
                rVarF.h();
                View view2 = fragmentA.mView;
                if (view2 == null) {
                    throw new IllegalStateException(AbstractC8235ym.k("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (fragmentA.mView.getTag() == null) {
                    fragmentA.mView.setTag(string);
                }
                fragmentA.mView.addOnAttachStateChangeListener(new m(this, rVarF));
                return fragmentA.mView;
            }
        }
        return null;
    }
}
