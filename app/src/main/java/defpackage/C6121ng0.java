package defpackage;

import com.facebook.react.bridge.ReactApplicationContext;
import com.oblador.keychain.KeychainModule;
import java.util.Collections;
import java.util.List;

/* renamed from: ng0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6121ng0 implements ZL0 {
    public final C0240Cv0 a = new C0240Cv0(16);

    @Override // defpackage.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        if (reactApplicationContext != null) {
            return Collections.singletonList(KeychainModule.withWarming(reactApplicationContext));
        }
        throw new Error("React Context was not provided");
    }

    @Override // defpackage.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
