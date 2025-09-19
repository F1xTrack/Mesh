package io.invertase.firebase.app;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;
import p000.AbstractC0783MR;
import p000.C6853sv;

@Keep
/* loaded from: classes2.dex */
public class ReactNativeFirebaseAppRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C6853sv> getComponents() {
        return Collections.singletonList(AbstractC0783MR.m5363a("react-native-firebase", "21.11.0"));
    }
}
