package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.huawei.hms.rn.push.constants.Core;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: nJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6052nJ0 extends AbstractC1750Wf {
    public final Context e;
    public C3538eD f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public C6052nJ0(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.ZC
    public final long c(C3538eD c3538eD) throws C2091aD, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f = c3538eD;
        g();
        Uri uriNormalizeScheme = c3538eD.a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C5861mJ0("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C5861mJ0("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C5861mJ0("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C5861mJ0("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C5861mJ0("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(AbstractC1705Vq.h(packageName, StringUtils.PROCESS_POSTFIX_DELIMITER, path), Core.RAW, null);
                if (identifier == 0) {
                    throw new C5861mJ0("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C5861mJ0(AbstractC7209tN0.w("Resource is compressed: ", uriNormalizeScheme), null, 2000);
            }
            this.g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
            this.h = fileInputStream;
            long j = c3538eD.f;
            try {
                if (length != -1 && j > length) {
                    throw new C5861mJ0(null, null, 2008);
                }
                long startOffset = this.g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new C5861mJ0(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.i = size;
                        if (size < 0) {
                            throw new C5861mJ0(null, null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.i = j2;
                    if (j2 < 0) {
                        throw new C2091aD(2008);
                    }
                }
                long j3 = c3538eD.g;
                if (j3 != -1) {
                    long j4 = this.i;
                    this.i = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.j = true;
                h(c3538eD);
                return j3 != -1 ? j3 : this.i;
            } catch (C5861mJ0 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C5861mJ0(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new C5861mJ0(null, e4, 2005);
        }
    }

    @Override // defpackage.ZC
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C5861mJ0(null, e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        e();
                    }
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            e();
                        }
                        throw th;
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            e();
                        }
                    }
                } catch (IOException e2) {
                    throw new C5861mJ0(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C5861mJ0(null, e3, 2000);
        }
    }

    @Override // defpackage.ZC
    public final Uri o() {
        C3538eD c3538eD = this.f;
        if (c3538eD != null) {
            return c3538eD.a;
        }
        return null;
    }

    @Override // defpackage.RC
    public final int r(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C5861mJ0(null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.h;
        int i3 = AbstractC0277Dh1.a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.i == -1) {
                return -1;
            }
            throw new C5861mJ0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - i4;
        }
        a(i4);
        return i4;
    }
}
