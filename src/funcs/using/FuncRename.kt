package funcs.using

import castle.Game
import funcs.FuncSrc

/**
 * 重命名
 * Created by asus1 on 2016/1/29.
 */
class FuncRename(game: Game) : FuncSrc(game) {

    override fun DoFunc(cmd: String) {
        //		game.echoln("请问您的新名字是？");
        if (cmd != "") {
            game.player.rename(cmd)
            game.echoln("重命名成功。新名字：" + cmd)
        } else {
            game.echoln("格式错误。请按照\"rename [新名字]\"的格式重命名！")
        }
    }

}
