package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.location.GeofenceStatusCodes;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* renamed from: nJ0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10377nJ0 extends AbstractC1426Wf {

    /* renamed from: e */
    public final Context f38265e;

    /* renamed from: f */
    public C3976eD f38266f;

    /* renamed from: g */
    public AssetFileDescriptor f38267g;

    /* renamed from: h */
    public FileInputStream f38268h;

    /* renamed from: i */
    public long f38269i;

    /* renamed from: j */
    public boolean f38270j;

    public C10377nJ0(Context context) {
        super(false);
        this.f38265e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: c */
    public final long mo2365c(C3976eD c3976eD) throws C1650aD, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f38266f = c3976eD;
        m8827g();
        Uri uriNormalizeScheme = c3976eD.f26595a.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.f38265e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new C10249mJ0("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new C10249mJ0("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C10249mJ0("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
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
                    throw new C10249mJ0("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new C10249mJ0("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(AbstractC1374Vq.m8589h(packageName, StringUtils.PROCESS_POSTFIX_DELIMITER, path), Core.RAW, null);
                if (identifier == 0) {
                    throw new C10249mJ0("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C10249mJ0(AbstractC11153tN0.m24911w("Resource is compressed: ", uriNormalizeScheme), null, 2000);
            }
            this.f38267g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.f38267g.getFileDescriptor());
            this.f38268h = fileInputStream;
            long j = c3976eD.f26600f;
            try {
                if (length != -1 && j > length) {
                    throw new C10249mJ0(null, null, 2008);
                }
                long startOffset = this.f38267g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new C10249mJ0(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.f38269i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.f38269i = size;
                        if (size < 0) {
                            throw new C10249mJ0(null, null, 2008);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.f38269i = j2;
                    if (j2 < 0) {
                        throw new C1650aD(2008);
                    }
                }
                long j3 = c3976eD.f26601g;
                if (j3 != -1) {
                    long j4 = this.f38269i;
                    this.f38269i = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.f38270j = true;
                m8828h(c3976eD);
                return j3 != -1 ? j3 : this.f38269i;
            } catch (C10249mJ0 e2) {
                throw e2;
            } catch (IOException e3) {
                throw new C10249mJ0(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new C10249mJ0(null, e4, 2005);
        }
    }

    @Override // p000.InterfaceC1586ZC
    public final void close() {
        this.f38266f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f38268h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f38268h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f38267g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C10249mJ0(null, e, 2000);
                    }
                } finally {
                    this.f38267g = null;
                    if (this.f38270j) {
                        this.f38270j = false;
                        m8826e();
                    }
                }
            } catch (Throwable th) {
                this.f38268h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f38267g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f38267g = null;
                        if (this.f38270j) {
                            this.f38270j = false;
                            m8826e();
                        }
                        throw th;
                    } finally {
                        this.f38267g = null;
                        if (this.f38270j) {
                            this.f38270j = false;
                            m8826e();
                        }
                    }
                } catch (IOException e2) {
                    throw new C10249mJ0(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C10249mJ0(null, e3, 2000);
        }
    }

    @Override // p000.InterfaceC1586ZC
    /* renamed from: o */
    public final Uri mo2366o() {
        C3976eD c3976eD = this.f38266f;
        if (c3976eD != null) {
            return c3976eD.f26595a;
        }
        return null;
    }

    @Override // p000.InterfaceC1082RC
    /* renamed from: r */
    public final int mo2367r(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f38269i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C10249mJ0(null, e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f38268h;
        int i3 = AbstractC7485Dh1.f2166a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.f38269i == -1) {
                return -1;
            }
            throw new C10249mJ0("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.f38269i;
        if (j2 != -1) {
            this.f38269i = j2 - i4;
        }
        m8825a(i4);
        return i4;
    }
}
