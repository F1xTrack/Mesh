package p000;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.HashSet;

/* renamed from: fE0 */
/* loaded from: classes.dex */
public final class C9343fE0 extends C10169lh0 implements InterfaceC7761Ip1 {

    /* renamed from: C */
    public String f27113C;

    /* renamed from: z */
    public final SparseIntArray f27114z = new SparseIntArray();

    /* renamed from: A */
    public final SparseIntArray f27111A = new SparseIntArray();

    /* renamed from: B */
    public final HashSet f27112B = new HashSet();

    public C9343fE0() {
        m2173D(this);
        this.f27113C = "Normal";
    }

    @Override // p000.InterfaceC7761Ip1
    /* renamed from: a0 */
    public final long mo4023a0(YogaNodeJNIBase yogaNodeJNIBase, float f, EnumC7813Jp1 enumC7813Jp1, float f2, EnumC7813Jp1 enumC7813Jp12) {
        O90.m5968f(yogaNodeJNIBase, "node");
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(this.f27113C);
        HashSet hashSet = this.f27112B;
        boolean zContains = hashSet.contains(Integer.valueOf(styleFromString));
        SparseIntArray sparseIntArray = this.f27111A;
        SparseIntArray sparseIntArray2 = this.f27114z;
        if (!zContains) {
            S91 s91 = this.f2652d;
            UN1.m7999c(s91);
            ProgressBar progressBarCreateProgressBar = ReactProgressBarViewManager.createProgressBar(s91, styleFromString);
            O90.m5967e(progressBarCreateProgressBar, "createProgressBar(...)");
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            sparseIntArray2.put(styleFromString, progressBarCreateProgressBar.getMeasuredHeight());
            sparseIntArray.put(styleFromString, progressBarCreateProgressBar.getMeasuredWidth());
            hashSet.add(Integer.valueOf(styleFromString));
        }
        return AbstractC11746y12.m26033b(sparseIntArray.get(styleFromString), sparseIntArray2.get(styleFromString));
    }

    @InterfaceC9871jM0(name = "styleAttr")
    public final void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.f27113C = str;
    }
}
