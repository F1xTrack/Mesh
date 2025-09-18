package com.google.android.gms.common;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p000.BinderC8916bx0;
import p000.InterfaceC9197e50;

/* loaded from: classes.dex */
abstract class zzj extends com.google.android.gms.common.internal.zzz {
    private final int zza;

    public zzj(byte[] bArr) {
        Preconditions.checkArgument(bArr.length == 25);
        this.zza = Arrays.hashCode(bArr);
    }

    public static byte[] zze(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC9197e50 interfaceC9197e50Zzd;
        if (obj != null && (obj instanceof com.google.android.gms.common.internal.zzaa)) {
            try {
                com.google.android.gms.common.internal.zzaa zzaaVar = (com.google.android.gms.common.internal.zzaa) obj;
                if (zzaaVar.zzc() == this.zza && (interfaceC9197e50Zzd = zzaaVar.zzd()) != null) {
                    return Arrays.equals(zzf(), (byte[]) BinderC8916bx0.m10547H(interfaceC9197e50Zzd));
                }
            } catch (RemoteException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final int zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.common.internal.zzaa
    public final InterfaceC9197e50 zzd() {
        return new BinderC8916bx0(zzf());
    }

    public abstract byte[] zzf();
}
