package p000;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes.dex */
public abstract class IQ0 {
    private final String zza = "com.google.android.gms.common.ui.SignInButtonCreatorImpl";
    private Object zzb;

    public abstract Object getRemoteCreator(IBinder iBinder);

    @KeepForSdk
    public final Object getRemoteCreatorInstance(Context context) throws HQ0 {
        if (this.zzb == null) {
            Preconditions.checkNotNull(context);
            Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context);
            if (remoteContext == null) {
                throw new HQ0("Could not get remote context.");
            }
            try {
                this.zzb = getRemoteCreator((IBinder) remoteContext.getClassLoader().loadClass(this.zza).newInstance());
            } catch (ClassNotFoundException e) {
                throw new HQ0("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new HQ0("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new HQ0("Could not instantiate creator.", e3);
            }
        }
        return this.zzb;
    }
}
