package p000;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactApplicationContext;
import com.github.doomsower.RNStartupTimeModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SI0 implements ZL0 {

    /* renamed from: b */
    public static final long f10678b = SystemClock.uptimeMillis();

    /* renamed from: a */
    public boolean f10679a;

    @Override // p000.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNStartupTimeModule(reactApplicationContext, f10678b, this.f10679a));
    }

    @Override // p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
