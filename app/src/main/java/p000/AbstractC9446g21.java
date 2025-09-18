package p000;

import android.content.ComponentName;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.provider.Settings;
import kotlin.KotlinVersion;
import kotlin.Pair;
import ru.mes.dnevnik.R;

/* renamed from: g21, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC9446g21 {

    /* renamed from: a */
    public static final Object f27532a;

    static {
        Integer numValueOf = Integer.valueOf(R.style.aosp_light);
        f27532a = AbstractC11077sn0.m24780h(new Pair("com.android.inputmethod.latin", new Pair(numValueOf, numValueOf)), new Pair("com.google.android.inputmethod.latin", new Pair(Integer.valueOf(R.style.gboard_light), Integer.valueOf(R.style.gboard_dark))), new Pair("com.touchtype.swiftkey", new Pair(Integer.valueOf(R.style.swiftkey_light), Integer.valueOf(R.style.swiftkey_dark))), new Pair("com.google.android.googlequicksearchbox", new Pair(Integer.valueOf(R.style.gboard_tts_light), Integer.valueOf(R.style.gboard_tts_dark))), new Pair("com.google.android.tts", new Pair(Integer.valueOf(R.style.gboard_tts_light), Integer.valueOf(R.style.gboard_tts_dark))), new Pair("ru.yandex.androidkeyboard", new Pair(Integer.valueOf(R.style.yandex_light), Integer.valueOf(R.style.yandex_dark))), new Pair("com.samsung.android.honeyboard", new Pair(Integer.valueOf(R.style.samsung_light), Integer.valueOf(R.style.samsung_dark))));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* renamed from: a */
    public static final int m18383a(S91 s91) throws Resources.NotFoundException {
        ComponentName componentNameUnflattenFromString;
        O90.m5968f(s91, "<this>");
        String string = Settings.Secure.getString(s91.getContentResolver(), "default_input_method");
        String packageName = null;
        if (string != null && (componentNameUnflattenFromString = ComponentName.unflattenFromString(string)) != null) {
            packageName = componentNameUnflattenFromString.getPackageName();
        }
        boolean zM9754c = AbstractC8731aU1.m9754c(s91);
        O90.m5968f("Current IME: " + packageName, "message");
        Pair pair = (Pair) f27532a.get(packageName);
        if (pair == null) {
            pair = new Pair(Integer.valueOf(R.style.gboard_light), Integer.valueOf(R.style.gboard_dark));
        }
        int iIntValue = ((Number) pair.f36702a).intValue();
        int iIntValue2 = ((Number) pair.f36703b).intValue();
        if (zM9754c && Build.VERSION.SDK_INT > 29) {
            iIntValue = iIntValue2;
        }
        TypedArray typedArrayObtainStyledAttributes = s91.obtainStyledAttributes(iIntValue, OG0.f8329a);
        O90.m5967e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            int color = typedArrayObtainStyledAttributes.getColor(0, -16777216);
            int i = typedArrayObtainStyledAttributes.getInt(1, 0);
            typedArrayObtainStyledAttributes.recycle();
            return Color.argb(Color.alpha(color), AbstractC10132lO1.m22418c(Color.red(color) + i, 0, KotlinVersion.MAX_COMPONENT_VALUE), AbstractC10132lO1.m22418c(Color.green(color) + i, 0, KotlinVersion.MAX_COMPONENT_VALUE), AbstractC10132lO1.m22418c(Color.blue(color) + i, 0, KotlinVersion.MAX_COMPONENT_VALUE));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }
}
