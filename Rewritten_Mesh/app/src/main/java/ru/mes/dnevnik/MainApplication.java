package ru.mes.dnevnik;

import android.app.Application;
import android.content.Context;
// import com.facebook.react.PackageList; // Will be re-enabled later
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import ru.mes.dnevnik.BuildConfig;

// JADX generated imports that are no longer valid
// import p000.AbstractC0246Du;
// import p000.AbstractC7222ym;
// import p000.AbstractC7230yu;
// import p000.C0786MU;
// import p000.C4042fG;
// import p000.C4049fN;
// import p000.C6617pR;
// import p000.C6730rE;
// import p000.C7650Gm0;
// import p000.C7978Mu0;
// import p000.C8090Oy0;
// import p000.CK0;
// import p000.DK0;
// import p000.EN1;
// import p000.F71;
// import p000.IJ0;
// import p000.InterfaceC11866yz0;
// import p000.O90;
// import p000.QL0;
// import p000.S02;
// import p000.UN1;


public final class MainApplication extends Application implements ReactApplication {

    private final ReactNativeHost mReactNativeHost = new DefaultReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            List<ReactPackage> packages = new ArrayList<>();
            // Packages that cannot be autolinked yet can be added manually here, for example:
            packages.add(new NativeEnvironmentsModulePackage());
            return packages;
        }

        @Override
        protected String getJSMainModuleName() {
            return "index";
        }

        @Override
        protected boolean isNewArchEnabled() {
            // return BuildConfig.IS_NEW_ARCHITECTURE_ENABLED;
            return false;
        }

        @Override
        protected Boolean isHermesEnabled() {
            // return BuildConfig.IS_HERMES_ENABLED;
            return true; // Hermes is enabled by default in new RN versions
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, /* native exopackage */ false);
        // if (BuildConfig.IS_NEW_ARCHITECTURE_ENABLED) {
        if (false) { // Disabled for now
            // If you opted-in for the New Architecture, we load the native entry point for this app.
            DefaultNewArchitectureEntryPoint.load();
        }
        // ReactNativeFlipper.initializeFlipper(this, getReactNativeHost().getReactInstanceManager());
    }
}
