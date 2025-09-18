package defpackage;

import com.facebook.react.defaults.DefaultComponentsRegistry;
import com.facebook.react.fabric.ComponentFactory;

/* loaded from: classes.dex */
public final class WE {
    @PK
    public final DefaultComponentsRegistry register(ComponentFactory componentFactory) {
        O90.f(componentFactory, "componentFactory");
        return new DefaultComponentsRegistry(componentFactory, 0);
    }
}
