package p000;

import com.facebook.react.bridge.ReactApplicationContext;
import com.oblador.keychain.KeychainModule;
import java.util.Collections;
import java.util.List;

/* renamed from: ng0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10423ng0 implements ZL0 {

    /* renamed from: a */
    public final C7460Cv0 f38468a = new C7460Cv0(16);

    @Override // p000.ZL0
    public final List createNativeModules(ReactApplicationContext reactApplicationContext) {
        if (reactApplicationContext != null) {
            return Collections.singletonList(KeychainModule.withWarming(reactApplicationContext));
        }
        throw new Error("React Context was not provided");
    }

    @Override // p000.ZL0
    public final List createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
