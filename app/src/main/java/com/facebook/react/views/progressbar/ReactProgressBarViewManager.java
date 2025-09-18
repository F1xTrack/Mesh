package com.facebook.react.views.progressbar;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.WeakHashMap;
import p000.AbstractC11406vL1;
import p000.AbstractC11746y12;
import p000.AbstractC3929dS;
import p000.C6340l4;
import p000.C9215eE0;
import p000.C9343fE0;
import p000.EnumC7813Jp1;
import p000.InterfaceC0005A4;
import p000.InterfaceC7543Ek1;
import p000.InterfaceC9101dL0;
import p000.InterfaceC9871jM0;
import p000.S91;

@InterfaceC9101dL0(name = ReactProgressBarViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactProgressBarViewManager extends BaseViewManager<C9215eE0, C9343fE0> implements InterfaceC0005A4 {
    static final String DEFAULT_STYLE = "Normal";
    static final String PROP_ANIMATING = "animating";
    static final String PROP_ATTR = "typeAttr";
    static final String PROP_INDETERMINATE = "indeterminate";
    static final String PROP_PROGRESS = "progress";
    static final String PROP_STYLE = "styleAttr";
    public static final String REACT_CLASS = "AndroidProgressBar";
    private static Object sProgressBarCtorLock = new Object();
    private final WeakHashMap<Integer, Pair<Integer, Integer>> mMeasuredStyles = new WeakHashMap<>();
    private final InterfaceC7543Ek1 mDelegate = new C6340l4(this, 1);

    public static ProgressBar createProgressBar(Context context, int i) {
        ProgressBar progressBar;
        synchronized (sProgressBarCtorLock) {
            progressBar = new ProgressBar(context, null, i);
        }
        return progressBar;
    }

    public static int getStyleFromString(String str) {
        if (str == null) {
            AbstractC3929dS.m17683p("ReactNative");
            return R.attr.progressBarStyle;
        }
        if (str.equals("Horizontal")) {
            return R.attr.progressBarStyleHorizontal;
        }
        if (str.equals("Small")) {
            return R.attr.progressBarStyleSmall;
        }
        if (str.equals("Large")) {
            return R.attr.progressBarStyleLarge;
        }
        if (str.equals("Inverse")) {
            return R.attr.progressBarStyleInverse;
        }
        if (str.equals("SmallInverse")) {
            return R.attr.progressBarStyleSmallInverse;
        }
        if (str.equals("LargeInverse")) {
            return R.attr.progressBarStyleLargeInverse;
        }
        if (str.equals(DEFAULT_STYLE)) {
            return R.attr.progressBarStyle;
        }
        "Unknown ProgressBar style: ".concat(str);
        AbstractC3929dS.m17683p("ReactNative");
        return R.attr.progressBarStyle;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public InterfaceC7543Ek1 getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<C9343fE0> getShadowNodeClass() {
        return C9343fE0.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12, float[] fArr) {
        int styleFromString = getStyleFromString(readableMap2.getString(PROP_STYLE));
        Integer numValueOf = Integer.valueOf(styleFromString);
        Pair<Integer, Integer> pairCreate = this.mMeasuredStyles.get(numValueOf);
        if (pairCreate == null) {
            ProgressBar progressBarCreateProgressBar = createProgressBar(context, styleFromString);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            pairCreate = Pair.create(Integer.valueOf(progressBarCreateProgressBar.getMeasuredWidth()), Integer.valueOf(progressBarCreateProgressBar.getMeasuredHeight()));
            this.mMeasuredStyles.put(numValueOf, pairCreate);
        }
        return AbstractC11746y12.m26033b(AbstractC11406vL1.m25402a(((Integer) pairCreate.first).intValue()), AbstractC11406vL1.m25402a(((Integer) pairCreate.second).intValue()));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C9343fE0 createShadowNodeInstance() {
        return new C9343fE0();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C9215eE0 createViewInstance(S91 s91) {
        C9215eE0 c9215eE0 = new C9215eE0(s91);
        c9215eE0.f26606b = true;
        c9215eE0.f26607c = true;
        return c9215eE0;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C9215eE0 c9215eE0) {
        ProgressBar progressBar = c9215eE0.f26609e;
        if (progressBar == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar.setIndeterminate(c9215eE0.f26606b);
        ProgressBar progressBar2 = c9215eE0.f26609e;
        Drawable indeterminateDrawable = progressBar2.isIndeterminate() ? progressBar2.getIndeterminateDrawable() : progressBar2.getProgressDrawable();
        if (indeterminateDrawable != null) {
            Integer num = c9215eE0.f26605a;
            if (num != null) {
                indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                indeterminateDrawable.clearColorFilter();
            }
        }
        c9215eE0.f26609e.setProgress((int) (c9215eE0.f26608d * 1000.0d));
        if (c9215eE0.f26607c) {
            c9215eE0.f26609e.setVisibility(0);
        } else {
            c9215eE0.f26609e.setVisibility(4);
        }
    }

    @Override // p000.InterfaceC0005A4
    @InterfaceC9871jM0(name = PROP_ANIMATING)
    public void setAnimating(C9215eE0 c9215eE0, boolean z) {
        c9215eE0.f26607c = z;
    }

    @Override // p000.InterfaceC0005A4
    @InterfaceC9871jM0(customType = RemoteMessageAttributes.COLOR, name = "color")
    public void setColor(C9215eE0 c9215eE0, Integer num) {
        c9215eE0.f26605a = num;
    }

    @Override // p000.InterfaceC0005A4
    @InterfaceC9871jM0(name = PROP_INDETERMINATE)
    public void setIndeterminate(C9215eE0 c9215eE0, boolean z) {
        c9215eE0.f26606b = z;
    }

    @Override // p000.InterfaceC0005A4
    @InterfaceC9871jM0(name = PROP_PROGRESS)
    public void setProgress(C9215eE0 c9215eE0, double d) {
        c9215eE0.f26608d = d;
    }

    @Override // p000.InterfaceC0005A4
    @InterfaceC9871jM0(name = PROP_STYLE)
    public void setStyleAttr(C9215eE0 c9215eE0, String str) {
        c9215eE0.getClass();
        ProgressBar progressBarCreateProgressBar = createProgressBar(c9215eE0.getContext(), getStyleFromString(str));
        c9215eE0.f26609e = progressBarCreateProgressBar;
        progressBarCreateProgressBar.setMax(1000);
        c9215eE0.removeAllViews();
        c9215eE0.addView(c9215eE0.f26609e, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // p000.InterfaceC0005A4
    public void setTestID(C9215eE0 c9215eE0, String str) {
        super.setTestId(c9215eE0, str);
    }

    @Override // p000.InterfaceC0005A4
    @InterfaceC9871jM0(name = PROP_ATTR)
    public void setTypeAttr(C9215eE0 c9215eE0, String str) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(C9215eE0 c9215eE0, Object obj) {
    }
}
