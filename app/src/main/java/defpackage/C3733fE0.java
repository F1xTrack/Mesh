package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.HashSet;

/* renamed from: fE0 */
/* loaded from: classes.dex */
public final class C3733fE0 extends C5742lh0 implements InterfaceC0691Ip1 {
    public String C;
    public final SparseIntArray z = new SparseIntArray();
    public final SparseIntArray A = new SparseIntArray();
    public final HashSet B = new HashSet();

    public C3733fE0() {
        D(this);
        this.C = "Normal";
    }

    @Override // defpackage.InterfaceC0691Ip1
    public final long a0(YogaNodeJNIBase yogaNodeJNIBase, float f, EnumC0769Jp1 enumC0769Jp1, float f2, EnumC0769Jp1 enumC0769Jp12) {
        O90.f(yogaNodeJNIBase, "node");
        int styleFromString = ReactProgressBarViewManager.getStyleFromString(this.C);
        HashSet hashSet = this.B;
        boolean zContains = hashSet.contains(Integer.valueOf(styleFromString));
        SparseIntArray sparseIntArray = this.A;
        SparseIntArray sparseIntArray2 = this.z;
        if (!zContains) {
            S91 s91 = this.d;
            UN1.c(s91);
            ProgressBar progressBarCreateProgressBar = ReactProgressBarViewManager.createProgressBar(s91, styleFromString);
            O90.e(progressBarCreateProgressBar, "createProgressBar(...)");
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
            progressBarCreateProgressBar.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            sparseIntArray2.put(styleFromString, progressBarCreateProgressBar.getMeasuredHeight());
            sparseIntArray.put(styleFromString, progressBarCreateProgressBar.getMeasuredWidth());
            hashSet.add(Integer.valueOf(styleFromString));
        }
        return AbstractC8095y12.b(sparseIntArray.get(styleFromString), sparseIntArray2.get(styleFromString));
    }

    @InterfaceC5297jM0(name = "styleAttr")
    public final void setStyle(String str) {
        if (str == null) {
            str = "Normal";
        }
        this.C = str;
    }
}
