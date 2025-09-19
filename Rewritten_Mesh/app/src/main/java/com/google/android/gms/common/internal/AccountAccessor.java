package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.IAccountAccessor;

/* loaded from: classes.dex */
public class AccountAccessor extends IAccountAccessor.Stub {
    @KeepForSdk
    public static Account getAccountBinderSafe(IAccountAccessor iAccountAccessor) {
        Account accountZzb = null;
        if (iAccountAccessor != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                accountZzb = iAccountAccessor.zzb();
            } catch (RemoteException unused) {
            } catch (Throwable th) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th;
            }
            Binder.restoreCallingIdentity(jClearCallingIdentity);
        }
        return accountZzb;
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final Account zzb() {
        throw null;
    }
}
