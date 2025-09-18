package p000;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.yandex.varioqub.config.model.ConfigValue;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public final class GM0 extends C1265U6 {

    /* renamed from: b */
    public double f3699b;

    /* renamed from: c */
    public double f3700c;

    /* renamed from: d */
    public double f3701d;

    /* renamed from: e */
    public boolean f3702e;

    /* renamed from: f */
    public double f3703f;

    /* renamed from: g */
    public double f3704g;

    /* renamed from: h */
    public String f3705h;

    /* renamed from: i */
    public List f3706i;

    /* renamed from: j */
    public double f3707j;

    /* renamed from: k */
    public int f3708k;

    /* renamed from: l */
    public double f3709l;

    /* renamed from: m */
    public int f3710m;

    public GM0(Context context) {
        super(context, null);
        this.f3699b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f3700c = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f3701d = ConfigValue.DOUBLE_DEFAULT_VALUE;
        int i = 0;
        this.f3702e = false;
        this.f3703f = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f3704g = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.f3707j = -9.223372036854776E18d;
        this.f3709l = 9.223372036854776E18d;
        O90.m5968f(context, "context");
        if ((context.getApplicationInfo().flags & 4194304) != 0 && (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1))) {
            i = 1;
        }
        setLayoutDirection(i);
        if (Build.VERSION.SDK_INT < 26) {
            setStateListAnimator(null);
        }
    }

    private double getStepValue() {
        double d = this.f3703f;
        return d > ConfigValue.DOUBLE_DEFAULT_VALUE ? d : this.f3704g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.f3700c - this.f3699b) / getStepValue());
    }

    /* renamed from: a */
    public final double m3044a(int i) {
        return i == getMax() ? this.f3700c : (i * getStepValue()) + this.f3699b;
    }

    @Override // android.view.View
    public final void announceForAccessibility(CharSequence charSequence) {
        Context context = getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
            accessibilityEventObtain.setEventType(16384);
            accessibilityEventObtain.setClassName(GM0.class.getName());
            accessibilityEventObtain.setPackageName(context.getPackageName());
            accessibilityEventObtain.getText().add(charSequence);
            new Timer().schedule(new Z00(accessibilityManager, accessibilityEventObtain), 1000L);
        }
    }

    /* renamed from: b */
    public final void m3045b() {
        if (this.f3703f == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            this.f3704g = (this.f3700c - this.f3699b) / 128;
        }
        setMax(getTotalSteps());
        m3046c();
        m3047d();
        double d = this.f3701d;
        double d2 = this.f3699b;
        setProgress((int) Math.round(((d - d2) / (this.f3700c - d2)) * getTotalSteps()));
    }

    /* renamed from: c */
    public final void m3046c() {
        double dMax = Math.max(this.f3707j, this.f3699b);
        double d = this.f3699b;
        this.f3708k = (int) Math.round(((dMax - d) / (this.f3700c - d)) * getTotalSteps());
    }

    /* renamed from: d */
    public final void m3047d() {
        double dMin = Math.min(this.f3709l, this.f3700c);
        double d = this.f3699b;
        this.f3710m = (int) Math.round(((dMin - d) / (this.f3700c - d)) * getTotalSteps());
    }

    public int getLowerLimit() {
        return this.f3708k;
    }

    public int getUpperLimit() {
        return this.f3710m;
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            setupAccessibility((int) this.f3701d);
        }
    }

    public void setAccessibilityIncrements(List<String> list) {
        this.f3706i = list;
    }

    public void setAccessibilityUnits(String str) {
        this.f3705h = str;
    }

    public void setLowerLimit(double d) {
        this.f3707j = d;
        m3046c();
    }

    public void setMaxValue(double d) {
        this.f3700c = d;
        m3045b();
    }

    public void setMinValue(double d) {
        this.f3699b = d;
        m3045b();
    }

    public void setStep(double d) {
        this.f3703f = d;
        m3045b();
    }

    public void setThumbImage(String str) {
        BitmapDrawable bitmapDrawable;
        if (str == null) {
            setThumb(getThumb());
            return;
        }
        try {
            bitmapDrawable = (BitmapDrawable) Executors.newSingleThreadExecutor().submit(new FM0(this, 0, str)).get();
        } catch (Exception e) {
            e.printStackTrace();
            bitmapDrawable = null;
        }
        setThumb(bitmapDrawable);
        setSplitTrack(false);
    }

    public void setUpperLimit(double d) {
        this.f3709l = d;
        m3047d();
    }

    public void setValue(double d) {
        this.f3701d = d;
        double d2 = this.f3699b;
        setProgress((int) Math.round(((d - d2) / (this.f3700c - d2)) * getTotalSteps()));
    }

    public void setupAccessibility(int i) {
        List list;
        if (this.f3705h == null || (list = this.f3706i) == null || list.size() - 1 != ((int) this.f3700c)) {
            return;
        }
        String str = (String) this.f3706i.get(i);
        int length = this.f3705h.length();
        String strSubstring = this.f3705h;
        if (str != null && Integer.parseInt(str) == 1) {
            strSubstring = strSubstring.substring(0, length - 1);
        }
        announceForAccessibility(str + " " + strSubstring);
    }
}
