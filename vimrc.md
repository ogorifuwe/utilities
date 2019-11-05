" source: https://github.com/VundleVim/Vundle.vim
 set nocompatible              " be iMproved, required
 filetype off                  " required

 " set the runtime path to include Vundle and initialize
 set rtp+=~/.vim/bundle/Vundle.vim
 call vundle#begin()
 " alternatively, pass a path where Vundle should install plugins
 "call vundle#begin('~/some/path/here')

 " let Vundle manage Vundle, required
 Plugin 'VundleVim/Vundle.vimo'
 " color schemes
 "Plugin 'chriskempson/base16-vim'
 "Plugin 'tomasr/molokai'
 Plugin 'flazz/vim-colorschemes'


 " All of your Plugins must be added before the following line
 call vundle#end()            " required
 filetype plugin indent on    " required
 " To ignore plugin indent changes, instead use:
 "filetype plugin on


 """"""""""""""""""""""""""""""""""""""""""""""""""""""""""""
 " colors and fonts
 """"""""""""""""""""""""""""""""""""""""""""""""""""""""""""
 " enable syntax highlighting
 syntax on 
 " using base 256 colors instead of base 16
 "set t_Co=256

 " access colors present in 256 colorspace
 "let base16colorspace=256

 " color scheme
 "colorscheme monokai " works with flazz/vim-colorshemes' turned off on 070819

 " set background style to dark instead of light
 "set background=dark "turned off on 070819

 " set utf as standard encoding and en-us as the standard language
 set encoding=utf8

 " Autoindent settings
 set shiftwidth=2 softtabstop=2 expandtab
 set smartindent
 set autoindent

 " Number Lines :se nu
 set number


 " setting file path; so I can find files easily
 set path+=**

 " to make finding files easier using tabs in
 set wildmenu

 " to switch between files in buffer quicker
 nnoremap <C-n> :bnext<CR>
 nnoremap <C-p> :bprevious<CR>

 " to automatically add (), (), []
 inoremap (<cr> (<cr>)<c-o><s-o>
 inoremap {<cr> {<cr>}<c-o><s-o>
 inoremap [<cr> [<cr>]<c-o><s-o>


 " CUSTOMIZATION OF netrw (vim's  native file explorer)
 " source::https://shapeshed.com/vim-netrw
 "let g:netrw_banner = 0                  " rid banner
 "let g:netrw_liststyle = 3
 "let g:netrw_browse_split = 4                  " open file in horizontal split
 "let g:netrw_winsize = 15   " width of the direectory explorer
 "augroup ProjectDrawer
 "    autocmd!
 "    autocmd VimEnter * :Vexplore
 "augroup END

