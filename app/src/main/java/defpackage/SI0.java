package defpackage;

import android.os.SystemClock;
import com.facebook.react.bridge.ReactApplicationContext;
import com.github.doomsower.RNStartupTimeModule;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SI0 implements ZL0 {
    public static final long b = SystemClock.uptimeMillis();
    public boolean a;

    @Override // defpackage.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RNStartupTimeModule(reactApplicationContext, b, this.a));
    }

    @Override // defpackage.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
