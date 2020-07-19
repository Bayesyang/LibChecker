package com.absinthe.libchecker.constant.librarymap

import com.absinthe.libchecker.R
import com.absinthe.libchecker.constant.LibChip
import java.util.regex.Pattern

object ServiceLibMap : BaseMap() {
    private val MAP: HashMap<String, LibChip> = hashMapOf(
        Pair(
            "com.xiaomi.push.service.XMPushService",
            LibChip(
                R.drawable.ic_lib_xiaomi,
                "MiPush"
            )
        ),
        Pair(
            "com.xiaomi.push.service.XMJobService",
            LibChip(
                R.drawable.ic_lib_xiaomi,
                "MiPush"
            )
        ),
        Pair(
            "com.xiaomi.mipush.sdk.PushMessageHandler",
            LibChip(
                R.drawable.ic_lib_xiaomi,
                "MiPush"
            )
        ),
        Pair(
            "com.xiaomi.mipush.sdk.MessageHandleService",
            LibChip(
                R.drawable.ic_lib_xiaomi,
                "MiPush"
            )
        ),
        Pair(
            "com.amap.api.location.APSService",
            LibChip(
                R.drawable.ic_lib_amap,
                "高德地图 SDK"
            )
        ),
        Pair(
            "com.tencent.bugly.beta.tinker.TinkerResultService",
            LibChip(
                R.drawable.ic_lib_bugly,
                "Bugly"
            )
        ),
        Pair(
            "com.tencent.tinker.lib.service.TinkerPatchForeService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Tinker"
            )
        ),
        Pair(
            "com.tencent.tinker.lib.service.TinkerPatchService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Tinker"
            )
        ),
        Pair(
            "com.tencent.tinker.lib.service.TinkerPatchService\$InnerService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Tinker"
            )
        ),
        Pair(
            "com.tencent.tinker.lib.service.TinkerPatchService\$IntentServiceRunner\$InnerService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Tinker"
            )
        ),
        Pair(
            "com.tencent.tinker.lib.service.DefaultTinkerResultService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Tinker"
            )
        ),
        Pair(
            "com.google.firebase.messaging.FirebaseMessagingService",
            LibChip(
                R.drawable.ic_lib_firebase,
                "FCM"
            )
        ),
        Pair(
            "com.google.firebase.components.ComponentDiscoveryService",
            LibChip(
                R.drawable.ic_lib_firebase,
                "Firebase"
            )
        ),
        Pair(
            "com.google.firebase.iid.FirebaseInstanceIdService",
            LibChip(
                R.drawable.ic_lib_firebase,
                "Firebase"
            )
        ),
        Pair(
            "com.google.android.datatransport.runtime.backends.TransportBackendDiscovery",
            LibChip(
                R.drawable.ic_lib_firebase,
                "Firebase"
            )
        ),
        Pair(
            "com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService",
            LibChip(
                R.drawable.ic_lib_firebase,
                "Firebase"
            )
        ),
        Pair(
            "com.google.android.gms.measurement.AppMeasurementJobService",
            LibChip(
                R.drawable.ic_lib_firebase,
                "Firebase Analytics"
            )
        ),
        Pair(
            "com.google.android.gms.measurement.AppMeasurementService",
            LibChip(
                R.drawable.ic_lib_firebase,
                "Firebase Analytics"
            )
        ),
        Pair(
            "com.huawei.hms.support.api.push.service.HmsMsgService",
            LibChip(
                R.drawable.ic_lib_huawei,
                "Huawei Push"
            )
        ),
        Pair(
            "com.huawei.updatesdk.service.deamon.download.DownloadService",
            LibChip(
                R.drawable.ic_lib_huawei,
                "Huawei Push"
            )
        ),
        Pair(
            "com.huawei.agconnect.core.ServiceDiscovery",
            LibChip(
                R.drawable.ic_lib_huawei,
                "AppGallery Connect"
            )
        ),
        Pair(
            "com.qq.e.comm.DownloadService",
            LibChip(
                R.drawable.ic_lib_tencent_ad,
                "腾讯广告 SDK"
            )
        ),
        Pair(
            "com.qq.e.downloader.DownloadService",
            LibChip(
                R.drawable.ic_lib_tencent_ad,
                "腾讯广告 SDK"
            )
        ),
        Pair(
            "com.vivo.push.sdk.service.CommandClientService",
            LibChip(
                R.drawable.ic_lib_vivo,
                "vivo Push"
            )
        ),
        Pair(
            "com.heytap.mcssdk.PushService",
            LibChip(
                R.drawable.ic_lib_oppo,
                "OPPO Push"
            )
        ),
        Pair(
            "com.heytap.mcssdk.AppPushService",
            LibChip(
                R.drawable.ic_lib_oppo,
                "OPPO Push"
            )
        ),
        Pair(
            "com.coloros.mcssdk.PushService",
            LibChip(
                R.drawable.ic_lib_oppo,
                "OPPO Push"
            )
        ),
        Pair(
            "com.alibaba.sdk.android.push.MsgService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.alibaba.sdk.android.push.channel.CheckService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.taobao.accs.ChannelService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.taobao.accs.ChannelService\$KernelService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.taobao.accs.data.MsgDistributeService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "org.android.agoo.accs.AgooService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.alibaba.sdk.android.push.AliyunPushIntentService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.alibaba.sdk.android.push.channel.TaobaoRecvService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.taobao.accs.internal.AccsJobService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.alibaba.sdk.android.push.channel.KeepChannelService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.taobao.agoo.TaobaoMessageIntentReceiverService",
            LibChip(
                R.drawable.ic_lib_aliyun,
                "阿里移动推送"
            )
        ),
        Pair(
            "com.alibaba.android.bindingx.plugin.weex.WXBindingXModuleService",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "Weex"
            )
        ),
        Pair(
            "mtopsdk.xstate.XStateService",
            LibChip(
                R.drawable.ic_lib_alibaba,
                "Mtop SDK"
            )
        ),
        Pair(
            "com.tencent.android.tpush.service.XGDaemonService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "信鸽推送"
            )
        ),
        Pair(
            "com.tencent.android.tpush.service.XGPushService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "信鸽推送"
            )
        ),
        Pair(
            "com.tencent.android.tpush.service.XGPushServiceV3",
            LibChip(
                R.drawable.ic_lib_tencent,
                "信鸽推送"
            )
        ),
        Pair(
            "com.tencent.android.tpush.service.XGPushServiceV4",
            LibChip(
                R.drawable.ic_lib_tencent,
                "信鸽推送"
            )
        ),
        Pair(
            "com.tencent.android.tpush.rpc.XGRemoteService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "信鸽推送"
            )
        ),
        Pair(
            "com.tencent.matrix.resource.CanaryWorkerService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Matrix"
            )
        ),
        Pair(
            "com.tencent.matrix.resource.CanaryResultService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "Matrix"
            )
        ),
        Pair(
            "com.tencent.smtt.export.external.DexClassLoaderProviderService",
            LibChip(
                R.drawable.ic_lib_tencent,
                "TBS"
            )
        ),
        Pair(
            "com.umeng.update.net.DownloadingService",
            LibChip(
                R.drawable.ic_lib_umeng,
                "友盟推送"
            )
        ),
        Pair(
            "com.umeng.message.UmengService",
            LibChip(
                R.drawable.ic_lib_umeng,
                "友盟推送"
            )
        ),
        Pair(
            "com.umeng.message.XiaomiIntentService",
            LibChip(
                R.drawable.ic_lib_umeng,
                "友盟推送"
            )
        ),
        Pair(
            "com.umeng.message.UmengDownloadResourceService",
            LibChip(
                R.drawable.ic_lib_umeng,
                "友盟推送"
            )
        ),
        Pair(
            "com.umeng.message.UmengIntentService",
            LibChip(
                R.drawable.ic_lib_umeng,
                "友盟推送"
            )
        ),
        Pair(
            "com.umeng.message.UmengMessageIntentReceiverService",
            LibChip(
                R.drawable.ic_lib_umeng,
                "友盟推送"
            )
        ),
        Pair(
            "com.umeng.message.UmengMessageCallbackHandlerService",
            LibChip(
                R.drawable.ic_lib_umeng,
                "友盟推送"
            )
        ),
        Pair(
            "com.meizu.cloud.pushsdk.NotificationService",
            LibChip(
                R.drawable.ic_lib_meizu,
                "Meizu Push"
            )
        ),
        Pair(
            "androidx.work.impl.background.systemjob.SystemJobService",
            LibChip(
                R.drawable.ic_lib_jetpack,
                "Jetpack Work Manager"
            )
        ),
        Pair(
            "androidx.work.impl.foreground.SystemForegroundService",
            LibChip(
                R.drawable.ic_lib_jetpack,
                "Jetpack Work Manager"
            )
        ),
        Pair(
            "androidx.room.MultiInstanceInvalidationService",
            LibChip(
                R.drawable.ic_lib_jetpack,
                "Jetpack Room"
            )
        ),
        Pair(
            "cn.jpush.android.service.PushService",
            LibChip(
                R.drawable.ic_lib_jpush,
                "极光推送"
            )
        ),
        Pair(
            "cn.jpush.android.service.DownloadService",
            LibChip(
                R.drawable.ic_lib_jpush,
                "极光推送"
            )
        ),
        Pair(
            "cn.jpush.android.service.DaemonService",
            LibChip(
                R.drawable.ic_lib_jpush,
                "极光推送"
            )
        ),
        Pair(
            "com.tencent.qalsdk.service.QalService",
            LibChip(
                R.drawable.ic_lib_tencent_cloud,
                "腾讯云通信"
            )
        ),
        Pair(
            "com.tencent.qalsdk.service.QalAssistService",
            LibChip(
                R.drawable.ic_lib_tencent_cloud,
                "腾讯云通信"
            )
        ),
        Pair(
            "com.google.android.gms.auth.api.signin.RevocationBoundService",
            LibChip(
                R.drawable.ic_lib_google,
                "Google Sign-In"
            )
        ),
        Pair(
            "com.google.android.gms.cast.framework.ReconnectionService",
            LibChip(
                R.drawable.ic_lib_google,
                "Google Cast"
            )
        ),
        Pair(
            "com.google.android.gms.cast.framework.media.MediaNotificationService",
            LibChip(
                R.drawable.ic_lib_google,
                "Google Cast"
            )
        ),
        Pair(
            "com.google.android.gms.analytics.AnalyticsService",
            LibChip(
                R.drawable.ic_lib_google_analytics,
                "Google Analytics"
            )
        ),
        Pair(
            "com.google.android.gms.analytics.AnalyticsJobService",
            LibChip(
                R.drawable.ic_lib_google_analytics,
                "Google Analytics"
            )
        ),
        Pair(
            "com.didi.virtualapk.delegate.LocalService",
            LibChip(
                R.drawable.ic_lib_didi,
                "VirtualAPK"
            )
        ),
        Pair(
            "com.didi.virtualapk.delegate.RemoteService",
            LibChip(
                R.drawable.ic_lib_didi,
                "VirtualAPK"
            )
        ),
        Pair(
            "org.hapjs.features.channel.ChannelService",
            LibChip(
                R.drawable.ic_lib_hapjs,
                "快应用"
            )
        ),
        Pair(
            "com.liulishuo.filedownloader.services.FileDownloadService\$SeparateProcessService",
            LibChip(
                R.drawable.ic_question,
                "FileDownloader"
            )
        ),
        Pair(
            "com.liulishuo.filedownloader.services.FileDownloadService\$SharedMainProcessService",
            LibChip(
                R.drawable.ic_question,
                "FileDownloader"
            )
        ),
        Pair(
            "com.igexin.sdk.PushService",
            LibChip(
                R.drawable.ic_question,
                "个推"
            )
        ),
        Pair(
            "com.blankj.utilcode.util.MessengerUtils\$ServerService",
            LibChip(
                R.drawable.ic_question,
                "AndroidUtilCode"
            )
        ),
        Pair(
            "com.baidu.location.f",
            LibChip(
                R.drawable.ic_lib_baidu,
                "百度地图 SDK"
            )
        ),
        Pair(
            "cmb.pb.cmbsafe.CmbService",
            LibChip(
                R.drawable.ic_lib_cmb,
                "招商银行 SDK"
            )
        ),
        Pair(
            "com.alipay.android.app.MspService",
            LibChip(
                R.drawable.ic_lib_alipay,
                "支付宝 SDK"
            )
        ),
        Pair(
            "com.netease.nimlib.service.NimService",
            LibChip(
                R.drawable.ic_lib_netease,
                "网易云通信 SDK"
            )
        ),
        Pair(
            "com.netease.nimlib.service.NimService\$Aux",
            LibChip(
                R.drawable.ic_lib_netease,
                "网易云通信 SDK"
            )
        ),
        Pair(
            "com.netease.nimlib.job.NIMJobService",
            LibChip(
                R.drawable.ic_lib_netease,
                "网易云通信 SDK"
            )
        ),
        Pair(
            "com.netease.nimlib.service.ResponseService",
            LibChip(
                R.drawable.ic_lib_netease,
                "网易云通信 SDK"
            )
        ),
        Pair(
            "com.evernote.android.job.v14.PlatformAlarmService",
            LibChip(
                R.drawable.ic_lib_evernote,
                "Android-Job"
            )
        ),
        Pair(
            "com.evernote.android.job.v21.PlatformJobService",
            LibChip(
                R.drawable.ic_lib_evernote,
                "Android-Job"
            )
        ),
        Pair(
            "com.yanzhenjie.permission.bridge.BridgeService",
            LibChip(
                R.drawable.ic_question,
                "AndPermission"
            )
        )
    )

    override fun getMap(): HashMap<String, LibChip> {
        return MAP
    }

    override fun findRegex(name: String): LibChip? {
        return when {
            Pattern.matches("com.qihoo360.replugin.component.service.server.PluginPitService(.*)", name) -> LibChip(R.drawable.ic_lib_360, "RePlugin", "regex_replugin")
            Pattern.matches("com.ss.android.socialbase.(.*)", name) -> LibChip(R.drawable.ic_lib_toutiao, "头条广告 SDK", "regex_toutiao_ad")
            Pattern.matches("com.bytedance.sdk.openadsdk.(.*)", name) -> LibChip(R.drawable.ic_lib_toutiao, "头条广告 SDK", "regex_toutiao_ad")
            else -> null
        }
    }
}