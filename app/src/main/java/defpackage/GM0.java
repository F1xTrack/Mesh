package defpackage;

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
public final class GM0 extends U6 {
    public double b;
    public double c;
    public double d;
    public boolean e;
    public double f;
    public double g;
    public String h;
    public List i;
    public double j;
    public int k;
    public double l;
    public int m;

    public GM0(Context context) {
        super(context, null);
        this.b = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.c = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.d = ConfigValue.DOUBLE_DEFAULT_VALUE;
        int i = 0;
        this.e = false;
        this.f = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.g = ConfigValue.DOUBLE_DEFAULT_VALUE;
        this.j = -9.223372036854776E18d;
        this.l = 9.223372036854776E18d;
        O90.f(context, "context");
        if ((context.getApplicationInfo().flags & 4194304) != 0 && (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_forceRTL", false) || (context.getSharedPreferences("com.facebook.react.modules.i18nmanager.I18nUtil", 0).getBoolean("RCTI18nUtil_allowRTL", true) && TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1))) {
            i = 1;
        }
        setLayoutDirection(i);
        if (Build.VERSION.SDK_INT < 26) {
            setStateListAnimator(null);
        }
    }

    private double getStepValue() {
        double d = this.f;
        return d > ConfigValue.DOUBLE_DEFAULT_VALUE ? d : this.g;
    }

    private int getTotalSteps() {
        return (int) Math.ceil((this.c - this.b) / getStepValue());
    }

    public final double a(int i) {
        return i == getMax() ? this.c : (i * getStepValue()) + this.b;
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

    public final void b() {
        if (this.f == ConfigValue.DOUBLE_DEFAULT_VALUE) {
            this.g = (this.c - this.b) / 128;
        }
        setMax(getTotalSteps());
        c();
        d();
        double d = this.d;
        double d2 = this.b;
        setProgress((int) Math.round(((d - d2) / (this.c - d2)) * getTotalSteps()));
    }

    public final void c() {
        double dMax = Math.max(this.j, this.b);
        double d = this.b;
        this.k = (int) Math.round(((dMax - d) / (this.c - d)) * getTotalSteps());
    }

    public final void d() {
        double dMin = Math.min(this.l, this.c);
        double d = this.b;
        this.m = (int) Math.round(((dMin - d) / (this.c - d)) * getTotalSteps());
    }

    public int getLowerLimit() {
        return this.k;
    }

    public int getUpperLimit() {
        return this.m;
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768 || (accessibilityEvent.getEventType() == 4 && isAccessibilityFocused())) {
            setupAccessibility((int) this.d);
        }
    }

    public void setAccessibilityIncrements(List<String> list) {
        this.i = list;
    }

    public void setAccessibilityUnits(String str) {
        this.h = str;
    }

    public void setLowerLimit(double d) {
        this.j = d;
        c();
    }

    public void setMaxValue(double d) {
        this.c = d;
        b();
    }

    public void setMinValue(double d) {
        this.b = d;
        b();
    }

    public void setStep(double d) {
        this.f = d;
        b();
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
        this.l = d;
        d();
    }

    public void setValue(double d) {
        this.d = d;
        double d2 = this.b;
        setProgress((int) Math.round(((d - d2) / (this.c - d2)) * getTotalSteps()));
    }

    public void setupAccessibility(int i) {
        List list;
        if (this.h == null || (list = this.i) == null || list.size() - 1 != ((int) this.c)) {
            return;
        }
        String str = (String) this.i.get(i);
        int length = this.h.length();
        String strSubstring = this.h;
        if (str != null && Integer.parseInt(str) == 1) {
            strSubstring = strSubstring.substring(0, length - 1);
        }
        announceForAccessibility(str + " " + strSubstring);
    }
}
