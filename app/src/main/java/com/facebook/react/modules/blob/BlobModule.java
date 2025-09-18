package com.facebook.react.modules.blob;

import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.facebook.fbreact.specs.NativeBlobModuleSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.network.NetworkingModule;
import com.facebook.react.modules.websocket.WebSocketModule;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import p000.AbstractC10889rJ0;
import p000.AbstractC11153tN0;
import p000.C0045Ai;
import p000.C0551Ik;
import p000.C7155xi;
import p000.C7218yi;
import p000.C7281zi;
import p000.InterfaceC0965PK;
import p000.InterfaceC10197lv0;
import p000.InterfaceC10325mv0;
import p000.InterfaceC10453nv0;
import p000.InterfaceC7599Fm1;
import p000.InterfaceC9101dL0;
import p000.O90;

@InterfaceC9101dL0(name = NativeBlobModuleSpec.NAME)
/* loaded from: classes.dex */
public class BlobModule extends NativeBlobModuleSpec {
    private final Map<String, byte[]> mBlobs;
    private final InterfaceC10197lv0 mNetworkingRequestBodyHandler;
    private final InterfaceC10325mv0 mNetworkingResponseHandler;
    private final InterfaceC10453nv0 mNetworkingUriHandler;
    private final InterfaceC7599Fm1 mWebSocketContentHandler;

    public BlobModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mBlobs = new HashMap();
        this.mWebSocketContentHandler = new C7155xi(this);
        this.mNetworkingUriHandler = new C7218yi(this);
        this.mNetworkingRequestBodyHandler = new C7281zi(this);
        this.mNetworkingResponseHandler = new C0045Ai(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] getBytesFromUri(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream = getReactApplicationContext().getContentResolver().openInputStream(uri);
        if (inputStreamOpenInputStream == null) {
            throw new FileNotFoundException(AbstractC11153tN0.m24911w("File not found for ", uri));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStreamOpenInputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getLastModifiedFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return new File(uri.toString()).lastModified();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getMimeTypeFromUri(Uri uri) {
        String fileExtensionFromUrl;
        String type = getReactApplicationContext().getContentResolver().getType(uri);
        if (type == null && (fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri.getPath())) != null) {
            type = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return type == null ? "" : type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getNameFromUri(Uri uri) {
        if ("file".equals(uri.getScheme())) {
            return uri.getLastPathSegment();
        }
        Cursor cursorQuery = getReactApplicationContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    return cursorQuery.getString(0);
                }
            } finally {
                cursorQuery.close();
            }
        }
        return uri.getLastPathSegment();
    }

    private WebSocketModule getWebSocketModule(String str) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            return (WebSocketModule) reactApplicationContextIfActiveOrWarn.getNativeModule(WebSocketModule.class);
        }
        return null;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addNetworkingHandler() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            NetworkingModule networkingModule = (NetworkingModule) reactApplicationContextIfActiveOrWarn.getNativeModule(NetworkingModule.class);
            networkingModule.addUriHandler(this.mNetworkingUriHandler);
            networkingModule.addRequestBodyHandler(this.mNetworkingRequestBodyHandler);
            networkingModule.addResponseHandler(this.mNetworkingResponseHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void addWebSocketHandler(double d) {
        int i = (int) d;
        WebSocketModule webSocketModule = getWebSocketModule("addWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, this.mWebSocketContentHandler);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void createFromParts(ReadableArray readableArray, String str) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        int length = 0;
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString("type");
            string.getClass();
            if (string.equals("string")) {
                byte[] bytes = map.getString("data").getBytes(Charset.forName("UTF-8"));
                length += bytes.length;
                arrayList.add(i, bytes);
            } else {
                if (!string.equals("blob")) {
                    throw new IllegalArgumentException("Invalid type for blob: " + map.getString("type"));
                }
                ReadableMap map2 = map.getMap("data");
                int i2 = map2.getInt("size") + length;
                arrayList.add(i, resolve(map2));
                length = i2;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            byteBufferAllocate.put((byte[]) it.next());
        }
        store(byteBufferAllocate.array(), str);
    }

    @InterfaceC0965PK
    public long getLengthOfBlob(String str) {
        long length;
        synchronized (this.mBlobs) {
            try {
                length = this.mBlobs.get(str) != null ? r4.length : 0L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return length;
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public Map<String, Object> getTypedExportedConstants() {
        Resources resources = getReactApplicationContext().getResources();
        int identifier = resources.getIdentifier("blob_provider_authority", "string", getReactApplicationContext().getPackageName());
        return identifier == 0 ? new HashMap() : AbstractC10889rJ0.m24257d("BLOB_URI_SCHEME", RemoteMessageConst.Notification.CONTENT, "BLOB_URI_HOST", resources.getString(identifier));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        int i = BlobCollector.f17920a;
        reactApplicationContext.runOnJSQueueThread(new RunnableC1929a(reactApplicationContext, this));
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void release(String str) {
        remove(str);
    }

    @InterfaceC0965PK
    public void remove(String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.remove(str);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void removeWebSocketHandler(double d) {
        int i = (int) d;
        WebSocketModule webSocketModule = getWebSocketModule("removeWebSocketHandler");
        if (webSocketModule != null) {
            webSocketModule.setContentHandler(i, null);
        }
    }

    public byte[] resolve(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        String queryParameter = uri.getQueryParameter("offset");
        int i = queryParameter != null ? Integer.parseInt(queryParameter, 10) : 0;
        String queryParameter2 = uri.getQueryParameter("size");
        return resolve(lastPathSegment, i, queryParameter2 != null ? Integer.parseInt(queryParameter2, 10) : -1);
    }

    @Override // com.facebook.fbreact.specs.NativeBlobModuleSpec
    public void sendOverSocket(ReadableMap readableMap, double d) {
        int i = (int) d;
        WebSocketModule webSocketModule = getWebSocketModule("sendOverSocket");
        if (webSocketModule != null) {
            byte[] bArrResolve = resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
            if (bArrResolve == null) {
                webSocketModule.sendBinary((C0551Ik) null, i);
                return;
            }
            C0551Ik c0551Ik = C0551Ik.f5116d;
            byte[] bArrCopyOf = Arrays.copyOf(bArrResolve, bArrResolve.length);
            O90.m5967e(bArrCopyOf, "copyOf(this, size)");
            webSocketModule.sendBinary(new C0551Ik(bArrCopyOf), i);
        }
    }

    public String store(byte[] bArr) {
        String string = UUID.randomUUID().toString();
        store(bArr, string);
        return string;
    }

    public void store(byte[] bArr, String str) {
        synchronized (this.mBlobs) {
            this.mBlobs.put(str, bArr);
        }
    }

    public byte[] resolve(String str, int i, int i2) {
        synchronized (this.mBlobs) {
            try {
                byte[] bArrCopyOfRange = this.mBlobs.get(str);
                if (bArrCopyOfRange == null) {
                    return null;
                }
                if (i2 == -1) {
                    i2 = bArrCopyOfRange.length - i;
                }
                if (i > 0 || i2 != bArrCopyOfRange.length) {
                    bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, i, i2 + i);
                }
                return bArrCopyOfRange;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public byte[] resolve(ReadableMap readableMap) {
        return resolve(readableMap.getString("blobId"), readableMap.getInt("offset"), readableMap.getInt("size"));
    }
}
